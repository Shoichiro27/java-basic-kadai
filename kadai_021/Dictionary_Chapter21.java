package kadai_021;

import java.util.HashMap; 

public class Dictionary_Chapter21 {
	
	private HashMap<String,String> dictionaryMap = new HashMap<>();
	
	public Dictionary_Chapter21() {
	dictionaryMap.put("apple","りんご");
	dictionaryMap.put("peach","桃");
	dictionaryMap.put("banana","バナナ");
	dictionaryMap.put("lemon","レモン");
	dictionaryMap.put("pear","梨");
	dictionaryMap.put("kiwi","キウィ");
	dictionaryMap.put("strawberry","いちご");
	dictionaryMap.put("grape","ぶどう");
	dictionaryMap.put("muscat","マスカット");
	dictionaryMap.put("cherry","さくらんぼ");
	}
	
	public void referer(String[] wordArray) {
		for (String word : wordArray) {
			if(dictionaryMap.containsKey(word)) {
				String meaning = dictionaryMap.get(word);
				System.out.println(word + "の意味は" + meaning);
			}else{
				System.out.println(word +"は辞書に存在しません");
			}
		}
	}
	
}
