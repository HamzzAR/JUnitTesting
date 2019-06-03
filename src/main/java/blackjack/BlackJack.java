package blackjack;

public class BlackJack {
	
	
	
	public String play(int player, int dealer) {
		if(isValid(player) && isValid(dealer)) {
			if(isLegal(player) && isLegal(dealer)) {
				
				if(player == dealer) {
					return dealer+"d";
				}else if(player > dealer) {
					return player+"p";
				}else {
					return dealer+"d";
				}
				
			}else {
				return "0";
			}
		}else {
			if(player == dealer) {
				return "-1";
			}else if(player > dealer) {
				return player+"p";
			}else {
				return dealer+"d";
			}
		}
	
	}

	private boolean isLegal(int number) {
		if(number >=4 && number <=21) {
			return true;
		}else {
			return false;
		}
	}

	private boolean isValid(int number) {
		if(number >=4 && number <=30) {
			return true;
		}else {
			return false;
		}
		
	}

}


