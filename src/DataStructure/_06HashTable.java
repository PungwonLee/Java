package DataStructure;

public class _06HashTable {

    public static class MyHash {
        public Slot[] hashTable;

        public MyHash(Integer size) {
            this.hashTable = new Slot[size];
        }

        public class Slot {
            String value;
            String key;
            Slot next;

            Slot(String key,String value) {
                this.key = key;
                this.value = value;
                this.next=null;
            }
        }

        public Integer hashFunc(String key) {
            return (int) (key.charAt(0)) % this.hashTable.length;
        }

        public boolean saveData(String key, String value) {
            Integer address = this.hashFunc(key);
            if (this.hashTable[address] != null) {
                Slot findSlot= this.hashTable[address];
                Slot prevSlot= this.hashTable[address];
                while (findSlot!=null){
                    if(findSlot.key==key){
                        findSlot.value=value;
                        return true;
                    }
                    prevSlot=findSlot;
                    findSlot=findSlot.next;
                }
                prevSlot.next=new Slot(key,value);

            } else {
                this.hashTable[address] = new Slot(key,value);
            }
            return true;
        }

        public String getData(String key) {
            Integer address = this.hashFunc(key);
            if (this.hashTable[address] != null) {
                return this.hashTable[address].value;
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("daveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.getData("daveLee");
        System.out.println("mainObject.getData(\"daveLee\") = " + mainObject.getData("daveLee"));
    }
}
