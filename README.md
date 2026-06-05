# Mission Support Tracker

Mission Support Tracker is a Java console application designed to practise support workflow thinking for public safety software environments.

The app allows users to log support tickets, assign severity, update ticket status, filter tickets, add investigation notes, and save/load tickets from a text file.

## Features

- Log new support tickets
- Automatically set new tickets to Open
- View all tickets
- View ticket details by ID
- Filter tickets by severity
- Filter tickets by status
- Update ticket status
- Add investigation notes
- Save and load tickets using file persistence

## Support Workflow

New tickets are created with an Open status. A user can then update the ticket through the support workflow:

Open -> Investigating -> Escalated -> Resolved

This reflects how support issues may be tracked from initial report through to resolution.

## Why I Built This

I built this project while preparing for a Mark43 interview because I wanted to better understand the type of workflow a support engineer might deal with.

Rather than only reading about the role, I wanted to build something that involved logging issues, prioritising severity, documenting investigation notes, updating statuses, and keeping records persistent between sessions.

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- File handling
- Git and GitHub

## What I Learned

This project helped me practise:

- Separating code into different classes
- Handling user input
- Using objects to represent real support tickets
- Saving and loading data from a file
- Thinking about support workflows from a user and technical perspective