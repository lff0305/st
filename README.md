Classes: 
```

                                        Animal
                                          |
                          +---------------+------------------------------------------------------------+
                          |                                                                            |
                      LandAnimal                                                                  SeaAnimal
                          |                                                                            |
     +---------+----------+------------+----------+---------+                         +----------------+-------------------+                                       
     |         |          |            |          |         |                        |                                     |
Catepillar  BaseBird     Cat          Dog        Frog     Butterfly               Dolphin                                 Fish   
               |                                                                                                           |
   +-----------+---------------+---------------+-----------------+                                                +--------+---------+
   |           |               |               |                 |                                                |                  |         
 Parrot     Rooster          Chicken          Duck              Bird                                            Shark           ClownFish
 ```
 
Interfaces:

`IWalk`: The ability to walk

`ISing`: The ability to sing

`ISay`: The ability to say

`ISwam`: The ability to swim

`IEatFish`: The ability to eat other fishes

`IFly`: The ability to fly

`ILearn`: Learn other animal to say ( Parrot)

`IMetamorphosis`: Grow & become other state

`IMakeJoke`: Make jokes

![](https://github.com/lff0305/st/blob/master/docs/Animal.png)


Code example to get animal which can walk, fly, etc: (See testCounter.java):
```
    Animal[] animals = ....... /// the input
    public void countSwim() {
        List<Animal> list = count(ISwim.class);
        System.out.println("Count swim = " + list.size());
    }

    private <T> List<Animal> count(Class<T> c) {
        return Arrays.asList(animals).stream().filter(
            c::isInstance
            ).collect(Collectors.toList());
    }
```

