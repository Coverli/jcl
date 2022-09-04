package com.Advance.Collection.Map;

// Map集合概述
public class statement {
    /*
        Map（映射）集合表示一种非常复杂的集合，允许按照某个键来访问元素。
        Map集合是由两个集合构成的，一个是键（key）集合，一个是值（value）集合。
        键集合是Set类型，因此不能有重复的元素。而值集合是Collection类型，可以有重复的元素。
        Map集合中的键和值是成对出现的。下图是Map类型的“国家代号”集合。
        键是国家代号集合，不能重复。值是国家集合，可以重复。
        +--------------------------------+
        |              Map               |
        +--------------------------------+
        |  键(key)集合      值(value)集合   |
        |                                |
        |    CN -------------> 中国       |
        |                                |
        |    RU ----   ------> 美国       |
        |            X                   |
        |    US-----   ----> 俄罗斯       |
        |                                |
        +--------------------------------+

        提示：Map集合更适合通过键快速访问值，就像查英文字典一样，
            键就是要查的英文单词，而值是英文单词的翻译和解释等。
            有的时候，一个英文单词会对应多个翻译和解释，这是与Map集合特性对应的。

        Map接口直接实现类主要是HashMap，HashMap是基于散列表数据结构的实现。
    */
}
