
public class Ex05 {

	public static void main(String[] args) {
		// 95이상이면 A+, 90이상이면 A, 85이상이면 B+, 80이상이면 B
		int score = 87;
		if (score >= 95) { // if(score <= 100 && score >=95)
			System.out.println("A+");
		}else if (score >= 90) { // if (score < 95 && score >= 90)
			System.out.println("A");
		}else if (score >= 85) { // if(score < 90 && score >= 85)
			System.out.println("B+");
		}else if (score >= 80) { // if(score < 85 && score > = 80)
			System.out.println("B");
		}else {
			System.out.println("F");
		}
		System.out.println("=== switch ===");
		switch(score) {
		case 100:case 99:case 98:case97:case96:
		case95: System.out.println("A+");break;
		case 94:case 93:case 92:case91:case96:
		case90: System.out.println("A");break;
		case 89:case 88:case 87:case86:
		case85: System.out.println("B+");break;
		case 84:case 83:case 82:case81:
		case80: System.out.println("B");break;
		default: System.out.println("F"); break;
		}
		System.out.println("=== switch ===");
		switch(score) {
		case 100:case 99:case 98:case97:case96:
		case95: System.out.println("A+");break;
		case 94:case 93:case 92:case91:case96:
		case90: System.out.println("A");break;
		
		default: System.out.println("F"); break;
		
		case 89:case 88:case 87:case86:
		case85: System.out.println("B+");break;
		case 84:case 83:case 82:case81:
		case80: System.out.println("B");break;
		
		}
	}

}
