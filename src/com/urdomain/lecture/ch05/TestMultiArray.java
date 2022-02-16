package com.urdomain.lecture.ch05;

public class TestMultiArray {

	public static void main(String[] args) {

		String[][] testaa = { { "필독 2022 대학별 추가합격 순위 결과! 과연 올해는?! [4]	편입의신2022.02.15.	405	0" },
				{ "필독 [편입 합격기념 초대박 이벤트]전원 5천원 증정+간식 대방출! [37]	편입의신2022.01.28.	1,498	10" },
				{ "공지 편입 성적 [3] new	광탈러01:30	152	0" }, { "공지시험보면서 느꼈던 학교 캠퍼스 특징 [1] new	alikj2211:30	108	0" },
				{ "공지 편입영어 문법 핵심노트+편입수학 미적분 문제집 무료! [4] new	편입의신01:04	29	1" } };

		for (int i = 0; i < testaa.length; i++) {

			for (String test : testaa[i]) {

				System.out.print(test + "\t");
							// println 에서 ln 지우기
			}
			System.out.println();
		}
	}
}
