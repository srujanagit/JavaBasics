# Git commands

Anyone can create a remote repo and provide the repository url,we can clone that repo and from our machine we can add some files and push to that remote repo



1)create a project in our machine
2)open git bash
3)cd <project location>
4)git init-----creates .git folder in our project directory
5)create a file in proj directory
6) ls -ltr(gives list of files in our project)
7)vi <file name>----gives contents of file
8)git add <file name>---adds file to stagging area
9)git commit -m "comments"-----adds files from statging area to local repository
10)git log------gives hash value of file content that we get after commiting the file to repository,content of file.(git log --pretty=oneline)
11) git branch(gives list of branches available or that local repo)
12) git checkout <branch>(shifts to that branch)--after changing branch we can add more files in our project file but they wont be reflected in the project if we shift to other branch.
13)so from the first branch merge second branch which created new files
git merge <branch name which created new file>


14)we create remote repository using git
15)git clone <clone repo url from git>---creates a local repo from remote repo
add new files in local repo and then add,commit
16)git push (in the local repo we can create files and push them to remote repo.
by default we have master branch in local repo,in remote repo 'origin' serves the same purpose)
17)when we move from master branch to any other branches and add files in the local repo -add-commit then to push these files created in new branch we need to create connection between this branch and remote repo origin using following command
(git push --set-upstream origin <branch name>)

18)to fetch data we give (git fetch origin master:master)
19)if we make any changes to files we sent to remote repo we need to add that file again and commit then push to repo which replaces the previous file
