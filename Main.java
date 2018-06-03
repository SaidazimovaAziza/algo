package algorithm;

import java.util.*;
import java.io.*;

class Solution {

	BufferedReader in;
	StringTokenizer str = null;
	PrintWriter out;

	private String next() throws Exception {
		if (str == null || !str.hasMoreElements())
			str = new StringTokenizer(in.readLine());
		return str.nextToken();
	}

	private int nextInt() throws Exception {
		return Integer.parseInt(next());
	}

	private long nextLong() throws Exception {
		return Long.parseLong(next());
	}

	Edge []e;
	int []p, size;
	
	public void run() throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

		int n = nextInt(), m = nextInt();
		p = new int[n];
		for(int i = 1; i < n; ++i) p[i] = i;
		size = new int[n];
		Arrays.fill(size, 1);

		e = new Edge[m];
		for(int i = 0; i < m; ++i) {
			int v = nextInt() - 1, u = nextInt() - 1, cost = nextInt();
			e[i] = new Edge(v, u, cost);
		}

		Arrays.sort(e);
		for(int i = 0; i < m; ++i) {
			Edge edge = e[i];
			// System.out.println(edge);
			int v = e[i].from, u = e[i].to, cost = e[i].cost;
			v = find(v);
			u = find(u);
			if (v != u) {
				union(v, u);
			}

			if (find(0) == find(n - 1)) {
				out.println(cost);
				out.close();
				return;
			}
		}

		out.println("NO PATH EXISTS");
		out.close();
	}

	private int find(int x) {
		if (x != p[x]) return p[x] = find(p[x]);
		return x;
	}

	private void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (size[a] > size[b]) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		p[a] = b;
	}

	class Edge implements Comparable<Edge> {
		int from, to, cost;

		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		public int compareTo(Edge other) {
			if (this.cost != other.cost) return this.cost - other.cost;
			if (this.from != other.from) return this.from - other.from;
			return this.to - other.to;
		}

		public String toString() {
			return this.from + " " + this.to + " " + this.cost;
		}
	}

	public static void main(String[] args) throws Exception{
		new Solution().run();
	}
}