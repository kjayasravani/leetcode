class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        //String first = words[0];
        // String last = words[words.length() - 1];
        // int last = words.length();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i < words.length;i++){
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
}