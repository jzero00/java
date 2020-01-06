package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		/*
		 * put()	: 지정된 키와 값을 저장
		 * get()	: 지정된 키의 값을 반환 (없으면 null)
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * keySet()	: 저장된 모든 키를 Set으로 반환
		 */

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다.");
		map.put("user", "마크도나르도");
		map.put("date", "2019-12-18 3:44");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "롯데리아");
		System.out.println(map.get("user"));	//기존의 값에 덮어씌워짐
		
		map.remove("user");
		System.out.println(map.get("user"));
		
		//map에 저장된 모든 내용을 출력
		Set<String> keys = map.keySet();
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String,Object> hm1 = new HashMap<>();
		
		hm1 = new HashMap<>();
		hm1.put("LPROD_ID", 1);
		hm1.put("LPROD_GU", "p101");
		hm1.put("LPROD_NM", "컴퓨터 제품");
		list.add(hm1);
		
		HashMap<String,Object> hm2 = new HashMap<>();
		hm2 = new HashMap<>();
		hm2.put("LPROD_ID", 2);
		hm2.put("LPROD_GU", "p102");
		hm2.put("LPROD_NM", "전자 제품\t");
		list.add(hm2);
		
		HashMap<String,Object> hm3 = new HashMap<>();
		hm3 = new HashMap<>();
		hm3.put("LPROD_ID", 3);
		hm3.put("LPROD_GU", "p201");
		hm3.put("LPROD_NM", "여성캐주얼\t");
		list.add(hm3);
		
		HashMap<String,Object> hm4 = new HashMap<>();
		hm4 = new HashMap<>();
		hm4.put("LPROD_ID", 4);
		hm4.put("LPROD_GU", "p202");
		hm4.put("LPROD_NM", "남성캐주얼\t");
		list.add(hm4);
		
		for(String key : list.get(0).keySet()){
			System.out.print(key + "\t");
		}
		
		for( int i = 0; i < list.size(); i++){
			HashMap<String,Object> hashMap = list.get(i);
			Set<String> keyset = hashMap.keySet();
			for(String key : keyset){
				System.out.println(hashMap.keySet());
			}
			System.out.println();
		}
		
	}

}
