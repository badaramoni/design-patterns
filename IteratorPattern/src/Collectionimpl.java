public class Collectionimpl implements CollectionInterface{


    String inputArray[] = {"Alloy Wheels v1","Chrome Wheels v1","HotWheels v1","Alloy Wheels v2","Chrome Wheels v2","HotWheels v2"};
    @Override
    public IteratorInterface getIterator() {
        return new Itr();
    }


    private class Itr implements IteratorInterface {

        int index =0;


        @Override
        public Boolean hasNext() {
            if (index < inputArray.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return inputArray[index++];
            }
            return null;
        }
    }
}
