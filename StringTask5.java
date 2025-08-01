class StringTask5 {
    public static void main(String[] args) {
        String str = "Java is funn is funnn";
        countFreq(str);
    }

    public static void countFreq(String str) {
        boolean[] track = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || track[i])
                continue;

            int cnt = 1; 
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && !track[j]) {
                    cnt++;
                    track[j] = true;
                }
            }

            System.out.println(str.charAt(i) + " : " + cnt);
        }
    }
}
