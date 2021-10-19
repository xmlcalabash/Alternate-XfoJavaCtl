# Alternate-XfoJavaCtl

Back in the early 2010’s, when I first tried to get Antenna House
working on MacOS, I was directed to try Ben Mendis’ [alternate
XfoJavaCtl](https://github.com/Sitwon/Alternate-XfoJavaCtl).

I have no idea if the official Java interface now has better support
for MacOS or not, I’ve simply moved my fork of the alternate
controller forward over time.

In this version, all I’ve done is refactored the build system to use
Gradle and generalized how `XfoObj` searches for the environment
variables necessary to run Antenna House Formatter.
