class Kamoku {
	int score;

	Kamoku(int score) {  // これがコンストラクタ。特殊なメソッド。クラス名と同じ。
		this.score = score; 
	}

// setScore というメソッドを定義する。
// score に値を設定する。
	public void setScore(int num){
		score = num;
	}

// getScore というメソッドを定義する。
// scoreを返す。
	public int getScore() {
		return score;
	}
}
