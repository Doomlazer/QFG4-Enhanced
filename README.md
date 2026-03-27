Quest for Glory IV: Shadows of Darkness Enhanced Update 1.2

This is a fork of AshLancer's repo that does two things:
1. Decompiles Ash's patches to show off the changes made in source code. The best way to view these changes is by looking through this commit: https://github.com/Doomlazer/QFG4-Enhanced/commit/1b3ca86a4c217b55949a847d7fa5de964872d185

2. Fix several bugs that were unfortunatly introduced by AshLancer's patches for various reasons.

I've not been able to reach AshLancer to ask for their blessing in creating this repo, but I'd like believe that they would approve. Additional bug fixes to the game would be welcome. Below is Ash's original readme.

-DoomLazer



***********************************************************
Quest for Glory IV: Shadows of Darkness Enhanced Update 1.1
Author: AshLancer
E-mail: raziel7fallen@gmail.com
GitHub: https://github.com/AshLancer/QFG3-Fan-Patch
***********************************************************


=============
Introduction:
=============

B O O !

~Happy Halloween!!~

It's been a rough couple of years... but here we are! I started work on this project in 2019 but couldn't make it in time for that Halloween. Then at the start of the next dread year, a year even more frightening than The Dark One, things went completely insane. Now here we are in 2021! As of this writing, Halloween is 3 days away and I wanted to finally put something out that could cheer people up; people who are going through the same turmoil that I am.

It goes without saying that QFG4 is my favorite game in the series!! From telling an epic, gothic story, and turning the stakes up to 11, to making you feel like a true hero. A hero who not only saves the entire world from encroaching darkness, but a small town, a community of colorful and memorable characters who were genuinely suffering. What can be said about this game that hasn't been talked about at length dozens of times already? Well how about the bugs for starters... this is probably the glitchiest game in the entire series. The crashes, dead ends, and lockups have plagued our collective childhoods for years. No more. This Halloween, Avoozl has crossed over to finally put an end to the terrifying errors in Shadows of Darkness.

But that's not all!

For the first time in 28 years, players can hear the bulk of narrator, John Rhys-Davies' lost audio as was originally intended. Much of the narration lies buried in the resource files due to coding issues, or was just cut for release time. One of the major reasons I wanted to revisit this game was the Youtube videos showing off Rhys-Davies' narration for game over screens. I'd always wanted to hear them played in-game like they were meant to be. I'm convinced now that the entire game was meant to be 100% voiced from context menus to the most minute descriptions and characters. Sadly, much of that narration now only exists on tapes probably lost in Sierra's vaults somewhere...

It's been a real fun ride, but things aren't over just yet! While I feel that I've succeeded in most of the original goals of this project, I still want to continue providing support for this game and the other games in the series, get the patches refined and hosted on Steam and GoG servers, in SHP installers, and maybe even meet and work with the ScummVM crew! I've just been extremely busy IRL for the last few months and things are only now comming to a head. Apologies for not being able to respond to everyone who's been asking lately. I want to find the time next year to get things done.

Ultimately, you guys are the true inspiration for this project. Thank you for all the years of love and dedication keeping these games alive; some of the earliest games that quite literally shaped my childhood and got me into RPGs in the first place. I sincerely hope that you have as good a time playing through this game, as I had fun producing this project!


=============
Requirements:
=============

This patch is intended for updating QFG4 (CD/DOS/English) from any previous version up to 1.1 (not to be confused with the old floppy 1.1 patch!). You can verify if you are running this version by opening the options menu in-game and clicking on the Sierra mountain logo. It should say "Version: 1.1A".

You'll need a copy of QFG4 installed on your device from either a CD-ROM, GoG, or Steam. I'm honestly not sure whether a 3.5" floppy or Windows version will work, but you're welcome to try! The NewRisingSun speed fixes are included in this patch with the exception of the wraith barrow (53.scr), which has been superceded. You will also most likely need a DOS emulator to run the game, depending on your system. The best two currently available are DosBox and ScummVM. This patch is fully compatible with either emulator. As I understand it, ScummVM uses its own interpreter to read and translate the original SCI code, then supercedes their own patches in memory wherever issues are identified. ScummVM users please be aware that you may run into some platform-specific issues that have nothing to do with the QFG4 code itself.

This patch is currently only compatible with the ENGLISH version of QFG4. Sincerest apologies to all foreign language users. I hope to release an international version in the near future!

You can always find the latest version hosted on my GitHub page at the top of this readme.


=============
Installation:
=============

1.) Backup the PATCHES folder in your QFG4 directory. An easy way to do this is to rename the folder to something like PATCHES_BAK.

e.g. C:\Sierra\Quest for Glory Collection Series\Quest for Glory 4
     C:\Program Files (x86)\GOG Galaxy\Games\Quest for Glory Series\Quest for Glory 4
     C:\Program Files (x86)\Steam\SteamApps\Common\Quest For Glory Collection\QFG4

2.) Extract the contents of the zip to the PATCHES folder in your QFG4 directory. Always overwrite when prompted.

3.) Due to changes made to the spellhook script (21.scr) and inventory scripts (16.scr & 35.scr), your current savegames will crash when you attempt to access those menus. They will also crash if you've saved in any of the rooms modified by the patch. ~You MUST start a new game in order to play!~

4.) Enjoy!!

5.) To uninstall, restore the old PATCHES folder to your QFG4 directory.


===========
Highlights:
===========

- Roughly an hour of cut audio has been restored! All deaths are now fully voiced by the narrator, John Rhys-Davies. Several of the game's items now have their descriptions voiced, although about 2/3rds of this audio is missing from the resource files and cannot be recovered. Many, many unique messages that previously could not be seen by the player due to faulty scripting will now play. Most of these messages involve casting Detect Magic, attempting to sleep, and using various items on rooms.

- Every dead end in the game should now be gone, including the infamous Domovoi bug, getting trapped in the Monastery from entering through the window, and the Wizard being unable to cast spells in the final room.

- Several annoying bugs have been squashed: bone cage issues, Paladin's Honor Shield disappearing after rest, Fighters with climb unable to read the book on Climbing, Necrotaurs drowning out Katrina's voice in front of the castle gates, music cutting out during the cave endgame, etc.

- Animation Improvements: Levitate sparklies should now appear consistent across rooms, the Fighter now swings his axe on the gate instead of a sword.

- Restored the cut encounter with the Crypt Wraith beneath the Cemetary. I based the script and reward on the information available within the unused narration. Some lines were taken from other parts of the game to complete the teller, but the overall encounter should be close to what the programmer had envisioned!

- Some missing deaths have been restored: That "Trapped" Feeling in the Thieves' Guild and "Spelled Down" during the fairy ambush could not be seen by the player due to duplicate entries in their respective rooms. Wraith to the Finish is included with the Crypt Wraith.

- Some inventory icons have been restored: Battle Axe, Piotyr's Sword, Piotyr's Shield, and cooked Elderbury Pie. Yuri now now gives you a key to the chest in your room (has no real purpose other than flavor).

- The final battle now has sound effects!!


*Note: A full list of changes with additional info (for NERDS!) has been included in the accompanying readme.


==================================================
Known Issues (AKA Things I didn't have time for!):
==================================================

- Save Rot: If you play QFG4 long enough (several hours at least!), you may find that your savegames are taking longer and longer to save/load. This issue eventually reaches the point where just looking at the character stat sheet is enough to crash the game. The crashes will gradually start to appear on other screens until you become "boxed-in" and every screen that you try to enter leads to a crash, rendering the save file unplayable. The rot can't spread to other save files but when you load an infected save, the increased loadtime appears to bleed into the memory and temporarily affect other non-infected saves until you quit and restart the game. The only known way to remove the rot is to start a fresh game. The cause is totally unknown and I'd welcome ANYONE to try their hand at debugging this insane monster!! For now, I highly, HIGHLY recommend keeping multiple saves per playthrough.

- Main Menu: Click on Create Character or Import Character, and select any class other than the Fighter. Now select Cancel and try to create a new Fighter. Clicking on the Fighter's door will now always cause the last class that you chose to be selected until you reload the main menu.

- Open the Options menu and set the Skill slider to lowest difficulty. Engage combat with a Vorpal Bunny and push it all the way to the right side of the screen. It's AI script will stop completely and the Hero enters unlimited battle time mode.

- The Paladin always starts with his Sense Danger ability, regardless of his Honor score. The game only checks for his class when displaying Sense Danger messages.

- Several of the Paladin's abilities: Flaming Sword, Heal, Honor Shield are gained at incorrect Honor values. [Credit: DarkSoul for going so in-depth with this issue!]

- On the death screen, continually pushing the Restore and Cancel buttons will cause the death message text and sprite to be redrawn slightly below their previous positions until they float off the dialog box entirely.

- Deaths: "That Burns You Up!" (watching Gypsy Davey burn at the stake), Shades of Socrates! (QFG3 death by poison), Have a nice trip... (QFG3 fall while Levitating and out of mana) aren't voiced. The audio is missing from the RESOURCE.AUD file.

- Battered By Badders death isn't anywhere in the game! This message was meant to be played when you lost in combat to a nest of badders in room 800 (Standing Squid Stone), but of course there aren't any badders in that room. Much like the Crypt Wraith, I suspect that this encounter was cut from the game at some point. The narration is fairly straightforward and it should be possible to seamlessly restore the encounter in the future with a little work.

- During his introduction at the inn, Franz voices the wrong line:

	Text: "I be Franz. I am wealthy garlic grower."
	Voice: "Listen, I'm tellin ya, Igor's death must be avenged!" (bug)

The truth is that Franz's audio doesn't exist anywhere! His entry in the RESOURCE.AUD file is a duplicate of Ivan's line from room 260.

- After saving Tanya, you can ask the three farmers about Rumors. The audio for one of Franz's lines is wrong:

	Text: "Perhaps we do tell things about others occasionally."
	Voice: "You must mean my apartment, we know of no cave in Mordavia." (bug)

Again, the correct audio doesn't seem to exist. The entry in the RESOURCE.AUD file is a duplicate of his earlier line.

- Asking Bonehead about the gnome or the hat while the digital audio is on, causes all of his messages to fast-foreward without giving the player time to read them. In fact, Bonehead has a total of 8 lines that are not voiced. The audio is apparently missing from the RESOURCE.AUD file. You can still read his lines by turning off digital audio in the Options menu before talking to him.

- Oiling any of the doors in the castle will oil ALL of them simultaneously!

- Revenant is always dropping 15 Kopeks after a battle instead of the intended range of 15-40 Kopeks (not that money matters much in this game anyway...). [Credit: sluicebox]


============
Other Stuff:
============

QFG4's soundtrack was originally composed for the Roland SC-55 sound module. I highly, highly recommend that you get yourself an actual SC-55 to hear the OST the way that it was always meant to be played. A much cheaper and easier alternative is to purchase Roland's Sound Canvas VA. This virtual sound canvas is available as a VSTi or AU plugin for DAWs, and uses high-quality samples from the actual SC-55, SC-88, SC-88 Pro, and SC-8820 modules to play GS, GM, or GM2 MIDI standards. If anything, it's a far, Far, FAR superior option to using the default Microsoft GS Wavetable Synth that comes with Windows!

EASTER EGGS

* Inside the inn, watch Bella for about 5 minutes.

* Inside the Burgomeister's Office, wait for Dimitri to turn his head about 35 times.

* At the Graveyard, move your hero to the top of the screen and wait for the next lightning flash.


===========
Legal Junk:
===========

These files (and this readme) are the sole product of yours truely: Alex Abrahamian, a.k.a. AshLancer, or raziel7fallen. I claim all ownership over my contents and changes to the game and reserve all rights in controlling how this patch is distributed and reused. Downloading and installing this patch means agreeing to the conditions as written below.

This patch is a non-profit 3rd party modification and is distributed as freeware, although donations are welcome. Neither myself nor this patch are legally affiliated with Sierra, Activision, or the Coles and I do not claim to respresent their interests or positions in any way, whatsoever.

The contents of this patch are provided "as-is". Although I've done my very best to playtest and ensure that this patch's quality meets all the goals and standards set for it, I am not liable, nor do I claim any responsibility for any damage resulting to the user's character, save file, software, or device that may occur from installing or running this patch.

You MAY redistribute this patch freely, install it as many times as you want, and advertise it so long as you give all credit to the author.

You may NOT claim this patch as your own, charge money for it, modify any of its contents (including this readme), or reuse its contents without my express permission. Any infringement is subject to full legal action and statutory damages as defined for Fair Use under section 107 of the US Copyright Act of 1976.

Quest for Glory IV: Shadows of Darkness is US Copyright 1993 by Sierra On-Line, Inc. and is designed by Lori Ann Cole and Corey Cole. SIERRA and SIERRA with mountain design is © 2020 by Activision Publishing, Inc. I do not claim ownership over any of their code, files, software, or properties except for my own changes which I have created for personal, educational, and recreational use.


========
Contact:
========

Questions, concerns, suggestions, donations, praises, condemnation, and more! Please direct them towards my email address at raziel7fallen@gmail.com.

Please include "QFG4" in the subject matter somewhere so that I can get an idea of what you're asking about. English is my primary language, although I'm slowly learning Spanish and Japanese. I'll typically respond within 1-2 business days unless something comes up. If it's a question that can be answered from the FAQ section, I'll refer you to that. If it's an emergency (like one of the files broke the game), I'll most likely investigate and release a hotfix promptly!

You can also contact me via posts or DMs on the official QFG GoG and Steam under my username: AshLancer. I'm on Discord as a member of Transolar Games and Quest for Glory Speedrunning. If I'm online I'll try to answer you ASAP.


========
Credits:
========

SCI Programming Community & SCI Companion 3.0
Without which, NONE of this would've been possible!!

NewRisingSun
Who developed the initial speed fixes that allowed us to keep playing these games on modern systems. You rock, dude!!

Sierra Help Pages
For their extraordinary effort in continuing to maintain support for these titles.

Search engines, various Let's Plays and speedruns on Youtube, and the forums and communities on Facebook, SHP, VOGONS, DosBox, ScummVM, GoG, and Steam. For feeding me plenty of bug reports, research material, and rumors to go on.

Quest for Glory Omnipedia
Providing a dump of the transcripts and additional background info.

Sierra Chest
For letting me get a look at the official manual and hintbook.

CyricZ
For his AWESOME walkthroughs and point lists that thoroughly cover every game in the series.

The Quest For Glory Speedrunning group on Discord:
misterprmiller, David Kraft-Ishihama, Crow!, c-square, Tequila, Istra Ahazu, and anyone else I forgot!
Providing additional glitch reports, hours of speedrunning goodness, and giving me a place that feels like home.

Transolar Games and all of the fan groups on Facebook: Quest for More Glory, Quest for Glory Fans, Sierra Gamers, et al. For keeping the brand and this amazing legacy alive!


SPECIAL THANKS TO:

Cyber Crimson,
Keeping me going all of those times that I got disheartened

My two younger brothers

2 cats and a bird

Ryan Cohen and GameStop
Power to the Players!

Sierra On-Line
Ken and Roberta Williams
For making some of the greatest PC games on the planet!

Lori Ann Cole and Corey Cole
For creating such an incredible series. You guys defined my childhood as a RPGamer! ^_^

Lastly,
dedicated to the players
...this project was for all of us.


========
Updates:
========

10/28/2021 - Version 1.1 - Initial Release