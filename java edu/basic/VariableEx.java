class VariableEx {
	public static void main(String[] args) {
		int num1 = 10;	// int�� ���� num1�� ���� �� ������ �� 10�� ����
		int num2 = 20, num3 = num1 + num2;
		// ���� �ڷ����� ������ ��� �� �� �̻��� ���ÿ� ���� �� ������ �� ����
		System.out.println("num1 : " + num1 + ", num2 : " + num2 +  ", num3 : " + num3);
		//num1 : 10, num2 : 20, num3 : 30

		char c1 = 'a';  // char���̹Ƿ� ���� ����ǥ�� ��� ����
		char c2 = 65;	// ������ char�� ������ ���� �����ϸ�, ������ ��� char���̹Ƿ� �����ڵ��� ���ڷ� ��ȯ
		System.out.println("c1 : " + c1 + ", c2 : " + c2);
		//c1 : a, c2 : A

		long num4 = 10000000000L;	
		// 100�� int���� 21������� ���尡�� long���� �ٲ㵵 ������ ����. ��� ���� �� L�� ����.
		// ������ ���ͷ� ���� ���� int�� ������ ����� ��� ���̻�� ��(L)�� �ٿ��� lon���̶�� ǥ�ø� ����
		// ���̻翡 ���� ������ ���� ��ҹ��� ������ ������ ���� �빮�ڸ� ����� (�˾ƺ��� ���� �ϱ� ����)
		System.out.println("num4 : " + num4);
		/*VariableEx.java:14: error: integer number too large: 10000000000
          int num4 = 10000000000;
                     ^
		1 error*/

		double d1 = 3.14;
		float f1 = 3.14F;
		// �Ǽ��� �⺻���� double�̹Ƿ� �Ǽ��� ���ͷ� ���� float�� �������� ���̻� ����(F)�� �ٿ��� ��
		System.out.println("d1 : " + d1 + ", f1 : " + f1);	// d1 : 3.14, f1 : 3.14
		/*
		VariableEx.java:25: error: incompatible types: possible lossy conversion(����ȯ) from double to float
                float f1 = 3.14;
                           ^
		1 error*/

		final int NUM;	// ��� NUM�� ����
		NUM = 100;		// ����� ���� �ʱ�ȭ��Ŵ
		System.out.println("NUM : " + NUM);

		// NUM = 20;	// ����̹Ƿ� �ʱ�ȭ�� ���� ������ �� ����
	}
}