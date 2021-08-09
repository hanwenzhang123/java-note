//Iterator: over the keys: by using keySet()
Iterator<String> it = capitalMap.keySet().iterator();

while(it.hasNext()) {
  String key =  it.next();
  String value = capitalMap.get(key);
  System.out.println("key = " + key + " value = " + value);
}

System.out.println("----------");

//Iterator: over the set (pair): by using entrySet
Iterator<Entry<String, String>> iterator = capitalMap.entrySet().iterator();

while(iterator.hasNext()) {
  Entry<String, String> entry =  iterator.next();
  System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
}

System.out.println("----------");

//Iterator hashmap using java8 forEach and lambda
capitalMap.forEach((key, value) -> System.out.println("key = " + k + " and value = " + v));
 
