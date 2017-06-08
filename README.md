# esec-fse-2017

This repository contains additional information to the submitted ESEC/FSE 2017 paper.

## Appendix: Finding fMRI-Compatible Material

In this appendix, we explain in more detail how we found the correct scrambling degree for the top-down program comprehension of our study. Specifically, we conducted a series of pilot studies with graduate computer-science students, in which we experimented with different degrees of scrambling.

### Scrambling to Japanese Characters

First, we tested a high degree of scrambling by translating the entire source code character-wise into Japanese characters. An example is shown below. We scrambled all characters except for the identifier names serving as beacons. The graduate students, of whom nobody spoke Japanese, needed considerably longer than 30 seconds to understand the snippets. Furthermore, when interviewing the participants about how they proceeded, we observed that Japanese characters lead to a clouding of the top-down comprehension by provoking other, unrelated cognitive processes (e.g., visual search). Thus, this scrambling degree was considerably too high for our study.

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

Consequently, in an incrementally conducted second attempt, we reduced the scrambling degree. To this end, we kept the source code in the Latin alphabet, but scrambled it with a Caesar shifting<sup>[1](#footnote1)</sup>. We show an example in below. When testing this scrambling degree, participants did not indicate any clouding cognitive processes such as visual search. Thus, this lower level of scrambling degree is more suitable by still allowing top-down comprehension. However, we found that a constant Caesar shifting permits the participants to quickly adapt to the scrambling, such that they learned what a scrambled word stood for (e.g., that `qom` means `int`).

### Scrambling with Variable Caesar Shifting

In the third iteration, we achieved an effective scrambling by modifying the Caesar shifting for each code snippet. For example, `int` was differently scrambled in each snippet. The graduate students who worked with these snippets showed that this variable Caesar shifting was effective as a scrambling method, since the participants needed not longer than 30 seconds to understand the snippets. Furthermore, when interviewing the participants afterward, they described that they still applied top-down comprehension. However, one participant mentioned that having code that does not compile was rather confusing (e.g., because of scrambling `int` to `qom`). Nevertheless, since the response times and correctness were promising, we decided to evaluate and fine-tune this scrambling degree in a large pilot study. Specifically, we evaluated scrambling Java keywords vs. not scrambling keywords, along with the variations of the two source code aspects (beacons, layout).

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

## Experimental Setup of Pre-Pilots for Replication

We provide the setup for both conducted pre-pilots in `/pre-pilots`. Both use the [PROPHET](https://github.com/feigensp/Prophet) tool. 

The first pre-pilot (`/pre-pilots/pre-pilot-1/`) fine-tuned the scrambling degree (i.e., keywords scrambled vs. not scrambled) in combination with beacons.

In the second pre-pilot (`/pre-pilots/pre-pilot-2/`) we tested the layout variable and the interdependence between beacons and layout.

## Used Training & fMRI Source-Code Snippets

### Top-down

You can find all twelve code snippets we used in the folder `/snippets/top-down/` (in all versions: original, with beacons (BO), without beacons (BS), and pretty layout (LO), and disrupted layout (LD).

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
- Top-down: BinaryToDecimal (LP, BY)
- Top-down: CrossSum (LD, BY)
- Top-down: ContainSubstring (LP, BN)
- Top-down: CountSameCharsAtSamePosition (LD, BN)
- Bottom-up: DoubleArray


Trial 2:
- Top-down: CountSameCharsAtSamePosition (LP, BY)
- Top-down: CountVowels (LD, BY)
- Top-down: ArrayAverage (LP, BN)
- Top-down: BinaryToDecimal (LD, BN)
- Syntax: Swap


Trial 3:
- Top-down: CountVowels (LP, BY)
- Top-down: ArrayAverage (LD, BY)
- Top-down: BinaryToDecimal (LP, BN)
- Top-down: CrossSum (LD, BN)
- Bottom-up: SumUpToN


Trial 4:
- Top-down: ArrayAverage (LP, BY)
- Top-down: BinaryToDecimal (LD, BY)
- Top-down: CrossSum (LP, BN)
- Top-down: ContainSubstring (LD, BN)
- Syntax: Average


Trial 5:
- Top-down: ContainSubstring (LP, BY)
- Top-down: CountSameCharsAtSamePosition (LD, BY)
- Top-down: CountVowels (LP, BN)
- Top-down: ArrayAverage (LD, BN)
- Bottom-up: Factorial


Trial 6:
- Top-down: CrossSum (LP, BY)
- Top-down: ContainSubstring (LD, BY)
- Top-down: CountSameCharsAtSamePosition (LP, BN)
- Top-down: CountVowels (LD, BN)
- Syntax: StringReverse

Each snippet was shown for 30 seconds. Between each snippet was a break of 30 seconds.

## Number of Participants, Tasks & Response Correctness

| # of Sessions 	| Condition                              	| # of Participant-Task-Tupels 	| Response Correctness 	|
|---------------	|----------------------------------------	|------------------------------	|----------------------	|
| 14            	| top-down: beacons, layout-pretty       	| 84                           	| 86%                  	|
| 14            	| top-down: beacons, layout-disrupted    	| 84                           	| 89%                  	|
| 14            	| top-down: no beacons, layout-pretty    	| 84                           	| 90%                  	|
| 14            	| top-down: no beacons, layout-disrupted 	| 84                           	| 92%                  	|
| 14            	| control: bottom-up                     	| 42                           	| 86%                  	|
| 14            	| control: syntax                        	| 42                           	| 71%                  	|

## Replication of the Siegmund Study

| Study         | # of Participants | # of Sessions | # of Session-Bottom-up-Task-Tupels | # of Session-Syntax-Task-Tupels |
|---------------|-------------------|---------------|------------------------------------|---------------------------------|
| Siegmund 2014 | 17                | 17            | 204                                | 204                             |
| FSE17         | 11                | 14            | 42                                 | 42                              |

---

<a name="footnote1">1</a>: Caesar shifting is a substitution cipher in which each letter is replaced by a letter some fixed number of positions down the alphabet.
