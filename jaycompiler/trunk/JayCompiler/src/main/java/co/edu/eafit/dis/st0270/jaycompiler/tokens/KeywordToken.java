package co.edu.eafit.dis.st0270.jaycompiler.tokens;

public class KeywordToken
	extends Token {

	public enum EnumKeyword {
		BOOLEAN,
		ELSE,
		IF,
		INT,
		MAIN,
		VOID,
		WHILE;
		static public EnumKeyword getKeywordOrdinal(String name) throws Error
		{
			if (name.compareTo("boolean") == 0) return BOOLEAN;
			if (name.compareTo("else") == 0) return ELSE;
			if (name.compareTo("if") == 0) return ELSE;
			if (name.compareTo("int") == 0) return INT;
			if (name.compareTo("main") == 0) return MAIN;
			if (name.compareTo("void") == 0) return VOID;
			if (name.compareTo("while") == 0) return WHILE;
			throw new Error("Unknown keyword ordinal");
		}

	}

	private String keyword = null;

	public KeywordToken(String keyword, int line, int column) {
		super(line,column);
		this.keyword = new String(keyword);
	}

	public String toString() {
		return "keyword: " + this.keyword + " " + super.toString();
	}

	public EnumKeyword getEnumKeyword()
		throws Error
	{
		return EnumKeyword.getKeywordOrdinal(keyword);
	}
}
