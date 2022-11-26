class ExtractDigitFromString {
    public static void main(String[] args) {
		
        String s = "123456789rambabu";
        
        String s1 =  s.replaceAll("[^0-9]", ""); // 1234566
        String s2 = s.replaceAll("[0-9]", "");  //  rambabu
        System.out.println(s1);
        System.out.println(s2);
        
        for(int i=0; i<s1.length(); i++)
        {
            if(s.charAt(i)%2 == 0)
            System.out.print((s.charAt(i)) + " ");
        }
    
    }
}