class StringEx4 {
	public static void main(String[] args) {
		// 1 ~ 1000 사이의 정수중 8이 들어있는 숫자의 개수를 출력
		int cnt = 0;
		for (int i = 1 ; i <= 1000 ; i++) {
			String str = i + "";
			if (str.indexOf('8') >= 0) {
				cnt++;
			}
		}
		System.out.println("8이 들어있는 숫자의 개수 : " + cnt);
	}
}
