class array6 {
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-2;i++) {
            String str = haystack.substring(i,i+needle.length());
            if(str == needle) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int j = strStr("sadbutsad","sad");
        System.out.println(j);
    }
}