# Software Development Tools - Homework 2

## a) Create remote repository
![a](image/a.png)
Short description...

## b) Clone repository
![b](image/b.png)
Used git clone

## c) Create empty project

![c](image/c.png)

Created a simple Java project with a Main class.

## d) Commit project

![d](image/d.png)

Initial commit using:
git add .
git commit -m "Initial commit - empty Java project"

## e) Add simple code (table)

![e](image/e.png)

Added an array and displayed its elements.

## f) Commit changes

![f](image/f.png)

## g) Initialize table with random values

![g](image/g.png)

Initialized array with random values.

## h) Commit changes

![h](image/h.png)

## i) Sort table elements

![i](image/i.png)

Implemented bubble sort algorithm.

## j) Commit changes

![j](image/j.png)

## k) Look at code history (git log)

![k](image/k.png)

Displayed commit history using:
git log

## l) Look at code annotations (git blame)

![l](image/l.png)

Displayed code annotations using:
git blame src/Main.java


## m) Checkout different revisions

![m1](image/m1.png)

Switched to an older commit using:
git checkout <commit_hash>

Then returned to the main branch:
![m2](image/m2.png)

## n) Add changes without commit

![n](image/n.png)

Modified the code without committing changes.

Used:
git status

## p) Push project to remote repository

![p](image/p.png)

Pushed project to GitHub using:
git push origin main

## r) Delete local project

![r](image/r.png)

Deleted local repository using:
rm -rf software-developments-tools-homework2

## s) Clone project from remote repository

![s](image/s.png)

Cloned project from GitHub using:
git clone https://github.com/Arnaud-57530/Software-developments-tools-homework2.git

## t) Create tag and switch between versions

![t](image/t.png)

Created tag:
git tag v1.0

Switched to tag:
git checkout v1.0

Returned to main branch:
git checkout main

## u) Create new branch + w) Switch to branch



![u_w](image/u.png)

Created new branch from main:
git branch new-feature

Switched to branch:
git checkout new-feature

## x) Improve code in branch

![x1](image/x1.png)
![x2](image/x2.png)

Changed the sorting algorithm in branch `new-feature` from bubble sort to selection sort.

## y) Merge branch into main

![y](image/y.png)

Merged branch `new-feature` into `main` using:
git merge new-feature