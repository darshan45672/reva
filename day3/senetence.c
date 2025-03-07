// write a c program to read a large sentence from the user

#include <stdio.h>
#include <string.h>

int main() {
    char sentence[1000];
    printf("Enter a sentence: ");
    scanf("%[^\n]s", &sentence);
    printf("You entered: %s\n", sentence);
    return 0;
}