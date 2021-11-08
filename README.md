# Measuring Neural Efficiency of Program Comprehension

This repository contains additional information to the [ESEC/FSE 2017](http://esec-fse17.uni-paderborn.de/) paper: 

Janet Siegmund und Norman Peitek und Chris Parnin und Sven Apel und Johannes Hofmeister und Christian Kästner und Andrew Begel und Anja Bethmann und André Brechmann, *Measuring Neural Efficiency of Program Comprehension*, Proceedings of the European Software Engineering Conference and the ACM SIGSOFT International Symposium on the Foundations of Software Engineering (ESEC/FSE), Seiten (140-150), ACM Press, Sep, 2017 ([preprint](https://www.infosun.fim.uni-passau.de/publications/docs/SPP+17.pdf), [digital library](https://dl.acm.org/doi/10.1145/3106237.3106268))


## Appendix: Finding fMRI-Compatible Material

In this appendix, we explain in more detail how we found the correct scrambling degree for the semantic-cues program comprehension of our study. Specifically, we conducted a series of pilot studies with graduate computer-science students, in which we experimented with different degrees of scrambling.

### Scrambling to Japanese Characters

First, we tested a high degree of scrambling by translating the entire source code character-wise into Japanese characters. An example is shown below. We scrambled all characters except for the identifier names serving as beacons. The graduate students, of whom nobody spoke Japanese, needed considerably longer than 30 seconds to understand the snippets. Furthermore, when interviewing the participants about how they proceeded, we observed that Japanese characters lead to a clouding of the semantic-cues comprehension by provoking other, unrelated cognitive processes (e.g., visual search). Thus, this scrambling degree was considerably too high for our study.

```
パブリック  静的  ボイド  メイン (文字列 [] 引数)# {
	型 数字#= 323;
	型 #checksum = 0;
	同時に (数字 != 0) {
		checksum = checksum + 数字 % 10;
		数字 = 数字/10;
	}
	システム.でる.印刷行(checksum);
}
```

### Scrambling with Constant Caesar Shifting

Consequently, in an incrementally conducted second attempt, we reduced the scrambling degree. To this end, we kept the source code in the Latin alphabet, but scrambled it with a Caesar shifting<sup>[1](#footnote1)</sup>. We show an example in below. When testing this scrambling degree, participants did not indicate any clouding cognitive processes such as visual search. Thus, this lower level of scrambling degree is more suitable by still allowing semantic-cues comprehension. However, we found that a constant Caesar shifting permits the participants to quickly adapt to the scrambling, such that they learned what a scrambled word stood for (e.g., that `qom` means `int`).

### Scrambling with Variable Caesar Shifting

In the third iteration, we achieved an effective scrambling by modifying the Caesar shifting for each code snippet. For example, `int` was differently scrambled in each snippet. The graduate students who worked with these snippets showed that this variable Caesar shifting was effective as a scrambling method, since the participants needed not longer than 30 seconds to understand the snippets. Furthermore, when interviewing the participants afterward, they described that they still applied semantic-cues comprehension. However, one participant mentioned that having code that does not compile was rather confusing (e.g., because of scrambling `int` to `qom`). Nevertheless, since the response times and correctness were promising, we decided to evaluate and fine-tune this scrambling degree in a large pilot study. Specifically, we evaluated scrambling Java keywords vs. not scrambling keywords, along with the variations of the two source code aspects (beacons, layout).

```
public float ayyaoAwyyaky(int[] array) {
    int mgqakyy = 0;
    int equ = 0;

    while (mgqakyy < array.length) {
        equ = equ + array[mgqakyy];
        mgqakyy = mgqakyy + 1;
    }

    float awyyaky = equ / (float) mgqakyy;
    return awyyaky;
}  
```

## Additional Data: Number of Participants, Tasks & Response Correctness

| # of Sessions 	| Condition                              	| # of Participant-Task-Tupels 	| Response Correctness 	|
|---------------	|----------------------------------------	|------------------------------	|----------------------	|
| 14            	| semantic-cues: beacons, layout-pretty       	| 84                           	| 86%                  	|
| 14            	| semantic-cues: beacons, layout-disrupted    	| 84                           	| 89%                  	|
| 14            	| semantic-cues: no beacons, layout-pretty    	| 84                           	| 90%                  	|
| 14            	| semantic-cues: no beacons, layout-disrupted 	| 84                           	| 92%                  	|
| 14            	| control: bottom-up                     	| 42                           	| 86%                  	|
| 14            	| control: syntax                        	| 42                           	| 71%                  	|

## Additional Data: Replication of the Siegmund Study

| Study         | # of Participants | # of Sessions | # of Session-Bottom-up-Task-Tupels | # of Session-Syntax-Task-Tupels |
|---------------|-------------------|---------------|------------------------------------|---------------------------------|
| Siegmund 2014 | 17                | 17            | 204                                | 204                             |
| FSE17         | 11                | 14            | 42                                 | 42                              |

## Additional Data: Brain Activation Location

| Activated Brain Area (Brodmann) | Cluster Size (in Voxel) | TAL Coordinates (X, Y, Z) |
|---------------------------------|-------------------------|---------------------------|
| BA6           | 665  | -34, 3, 53   |
| BA21          | 1352 | -56, -39, -3 |
| BA44          | 547  | -46, 11, 22  |
| BA39 left     | 1249 | -44, -56, 18 |
| BA39 right    | 933  | 50, -53, 11  |


# Replication

## Experimental Setup of Pre-Pilots for Replication

We provide the setup for both conducted pre-pilots in `/pre-pilots`. Both use the [PROPHET](https://github.com/feigensp/Prophet) tool. 

The first pre-pilot (`/pre-pilots/pre-pilot-1/`) fine-tuned the scrambling degree (i.e., keywords scrambled vs. not scrambled) in combination with beacons.

In the second pre-pilot (`/pre-pilots/pre-pilot-2/`) we tested the layout variable and the interdependence between beacons and layout.

## Used Training & fMRI Source-Code Snippets

### Semantic-cues

You can find all twelve code snippets we used in the folder `/snippets/semantic-cues/` (in all versions: original, with beacons (BO), without beacons (BS), and pretty layout (LO), and disrupted layout (LD).

The selected algorithms are:

| Numerical  | Strings |
| ------------- | ------------- |
| ArrayAverage | ContainsSubstrings |
| BinaryToDecimal | CountSameCharsAtSamePosition |
| CrossSum  | CountVowels |
| FirstAboveThreshold | IntertwineTwoWords |
| Power  | Palindrome |
| SquareRoot  | ReverseWord |

### Control: Bottom-up

You can find all six bottom-up code snippets we used in the folder `/snippets/bottom-up/`.

- CommonChars
- CrossSum
- DoubleArray
- Factorial
- MaxInArray
- SumUpToN

### Control: Syntax

You can find all six syntax error code snippets we used in the folder `/snippets/syntax/`.

- Average
- DoubleArray
- Power
- ReverseIntArray
- ReverseWord
- Swap

## Before fMRI Session: Training with PROPHET

The participant had to view, recall and review six code snippets before each fMRI session. This training before the fMRI session was done with [PROPHET](https://github.com/feigensp/Prophet). The tool guided the participant through this process.

The selection of six snippets was randomized for each participant. Thus, which snippets each participant saw in their sessions varies. Next, we will only show one example for a participant:

- View BinaryToDecimal snippet
- Recall the snippet
- Review BinaryToDecimal snippet
- View CrossSum snippet
- Recall the snippet
- Review CrossSum snippet
- View ContainSubstring snippet
- Recall the snippet
- Review ContainSubstring snippet
- View CountSameCharsAtSamePosition snippet
- Recall the snippet
- Review CountSameCharsAtSamePosition snippet
- View ArrayAverage snippet
- Recall the snippet
- Review ArrayAverage snippet
- View CountVowels snippet
- Recall the snippet
- Review CountVowels snippet

You can find an examplary Prophet experiment file under `/prophet/training_example.xml`.

## fMRI Session: Snippet Sequence

The session in the fMRI scanner featured the same six snippets the participants were trained for. Thus, the fMRI session was also different for each participant. The snippet display order was also randomized. The following example is for one participant with the training from above:

Trial 1:
- Semantic-cues: BinaryToDecimal (LP, BY)
- Semantic-cues: CrossSum (LD, BY)
- Semantic-cues: ContainSubstring (LP, BN)
- Semantic-cues: CountSameCharsAtSamePosition (LD, BN)
- Bottom-up: DoubleArray


Trial 2:
- Semantic-cues: CountSameCharsAtSamePosition (LP, BY)
- Semantic-cues: CountVowels (LD, BY)
- Semantic-cues: ArrayAverage (LP, BN)
- Semantic-cues: BinaryToDecimal (LD, BN)
- Syntax: Swap


Trial 3:
- Semantic-cues: CountVowels (LP, BY)
- Semantic-cues: ArrayAverage (LD, BY)
- Semantic-cues: BinaryToDecimal (LP, BN)
- Semantic-cues: CrossSum (LD, BN)
- Bottom-up: SumUpToN


Trial 4:
- Semantic-cues: ArrayAverage (LP, BY)
- Semantic-cues: BinaryToDecimal (LD, BY)
- Semantic-cues: CrossSum (LP, BN)
- Semantic-cues: ContainSubstring (LD, BN)
- Syntax: Average


Trial 5:
- Semantic-cues: ContainSubstring (LP, BY)
- Semantic-cues: CountSameCharsAtSamePosition (LD, BY)
- Semantic-cues: CountVowels (LP, BN)
- Semantic-cues: ArrayAverage (LD, BN)
- Bottom-up: Factorial


Trial 6:
- Semantic-cues: CrossSum (LP, BY)
- Semantic-cues: ContainSubstring (LD, BY)
- Semantic-cues: CountSameCharsAtSamePosition (LP, BN)
- Semantic-cues: CountVowels (LD, BN)
- Syntax: StringReverse

Each snippet was shown for 30 seconds. Between each snippet was a break of 30 seconds.

---

<a name="footnote1">1</a>: Caesar shifting is a substitution cipher in which each letter is replaced by a letter some fixed number of positions down the alphabet.
