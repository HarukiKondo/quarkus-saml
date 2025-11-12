package eu.stenlund;

/**
 * シンプルなCountryクラス
 */
public class Country {

    // 名前
    public String name;
    // 説明
    public String description;
    
    public Country() {
    }

    /**
     * コンストラクター
     */
    public Country(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
}
