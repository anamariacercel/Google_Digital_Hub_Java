package com.wordcount;

import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String []args)  throws IOException
    {
        Scanner s=null;
        try
        {
            s = new Scanner(new BufferedReader(new FileReader("D:/Proiecte/Google Atelierul Digital/Exceptions & IO/src/com/wordcount/text.txt")));
            s.useDelimiter("[\\s\\.]+");


            Map<String, Integer> wordcounts= new TreeMap<String,Integer>(Collections.reverseOrder());

            while(s.hasNext())
            {
                String next = s.next().toLowerCase();
                if(!wordcounts.containsKey(next))
                {
                    wordcounts.put(next,1);
                }
                else {  wordcounts.put(next , wordcounts.get(next)+1);
                }
            }

            final Map<String, Integer> sortedByCount = sortByValue(wordcounts);
            System.out.println("Top words by count are: ");
            int i=0;
                Iterator it = sortedByCount.entrySet().iterator();
                while(it.hasNext())
                {
                    if(i==10)
                        break;
                    Map.Entry pair = (Map.Entry) it.next();
                    System.out.println(pair.getKey() + " = " + pair.getValue());
                    i++;

                }


            }
        finally{
            s.close();
        }
        }
    public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
        return wordCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
    }

