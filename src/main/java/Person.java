public class Person {
        private String name;
        private int Age;
        private String gender;
        private String[] interests;

        public Person(String name, int Age, String gender, String[] interests) {
            this.name=name;
            this.Age=Age;
            this.gender=gender;
            this.interests=interests;
        }

        public String Hello(){
            String holder="";


            for (int i=0;i<interests.length;i++){
                holder+=interests[i];
                if (i<interests.length-2){
                    holder+=", ";
                }
                else if (i==interests.length-2){
                    holder+=" and ";

                    for (int j=0;j==name.length();j++){
                        holder+=name;
                        if (j==name.length()+1){
                            holder+=" is";
                        }

                    }
                }


            }

            System.out.print( "Hello my name is "+ name +" and I am "+ Age +"years old."+"My interests are ");


            return something;
        }
    }



