class CondOpEx {
	public static void main(String[] args) {
		int n1 = 10, n2 = 20, result;
		// n1과 n2 중 더 큰 수를 result에 저장하여 출력(if문 사용)

		if (n1 > n2) {
			result = n1;
			System.out.println("result1 : " + result);
		} else if (n1 < n2) {
			result = n2;
			System.out.println("result1 : " + result);
		}

		result = n1 > n2 ? n1 : n2;
		// n1이 n2보다 크면 n1을 아니면 n2를 result에 저장
		System.out.println("result3 : " + result);
	}
}
