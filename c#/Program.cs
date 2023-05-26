// See https://aka.ms/new-console-template for more information
using System;
using System.Threading;

class Program
{
    static void Main()
    {
        // Define the frequencies and durations for each note
        int[] frequencies = { 330, 392, 440, 392, 330, 330, 392, 440, 392, 330, 392, 440, 392, 330, 330, 392, 440, 392, 330, 392, 440, 392, 330 };
        int[] durations = { 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500 };
        
        // Play the song
        for (int i = 0; i < frequencies.Length; i++)
        {
            Console.Beep(frequencies[i], durations[i]);
            Thread.Sleep(durations[i]);
        }
    }
}
  


