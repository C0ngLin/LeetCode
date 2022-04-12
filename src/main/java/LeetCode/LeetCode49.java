package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author abcd
 * @version 1.0
 * @date 2022/3/31 12:59
 *  字母异位词分组
 *  给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 */
public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<String, List<String>>();
        for (String str :
                strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> orDefault = res.getOrDefault(key, new ArrayList<>());
            orDefault.add(str);
            res.put(key, orDefault);

        }
        return new ArrayList<List<String>>(res.values());
    }
}
