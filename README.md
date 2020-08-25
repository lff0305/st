Classes: 
```

                                        Animal
                                          |
                          +---------------+-------------------------------------------------+
                          |                                                                 |
                      LandAnimal                                                        SeaAnimal
                          |                                                                 |
     +---------+----------+------------+----------+---------+              +----------------+-------------------+                                       
     |         |          |            |          |         |              |                                    |
Catepillar  BaseBird     Cat          Dog        Frog     Butterfly     Dolphin                               Fish   
               |                                                                                                |
   +-----------+---------------+---------------+-----------------+                                     +--------+---------+
   |           |               |               |                 |                                     |                  |         
 Parrot     Rooster          Chicken          Duck              Bird                                 Shark           ClownFish
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
Code for Localed `say()` : ([LocaleManager](https://github.com/lff0305/st/blob/master/src/main/java/org/lff/locale/LocaleManager.java) will load local data from `resources/locales` [dir](https://github.com/lff0305/st/blob/master/src/main/resources/locales)
```
    public String say() {
        String msg = LocaleManager.getInstance().getString(this.getClass(), "A rooster says in English");
        System.out.println(msg);
        return msg;
    }
```
And set the locale before call `say()`:
```
    @Test
    public void testGerman() {
        LocaleManager.getInstance().set("German");
        String s = new Rooster().say();
        Assert.assertEquals("kikeriki", s);
    }
```

RestfulAPI:

`Animal GET /v1/animals/[name]`: Get the animal whose name is [name]. For example, `GET /v1/animals/shark`

`List<Animal> GET /v1/animals/ability/[ability]`: Get animals who can do some ability. For example, `GET /v1/animals/fly`

`String GET /v1/animals/[name]/language`: Get what the animals say with the language. For example, `GET /v1/animals/rooster/German`
