;;; Sierra Script 1.0 - (do not remove this comment)
;;; Decompiled by sluicebox
(script# 360)
(include sci.sh)
(use Main)
(use GloryRm)
(use TargFeature)
(use DeathControls)
(use Array)
(use Scaler)
(use PolyPath)
(use Polygon)
(use Feature)
(use Motion)
(use Actor)
(use System)

(public
	rm360 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5 = 120
	local6
	local7
	local8
	local9
	local10
)

(instance rm360 of GloryRm
	(properties
		picture 360
	)

	(method (init)
		(gEgo init: setScaler: Scaler 135 72 189 129)
		(= local9 (IDArray new: 8))
		(= local10
			(IntArray
				with: 64 143 78 153 75 156 70 160 66 166 62 173 59 180 59 181
			)
		)
		(cond
			((== gPrevRoomNum 780)
				(gEgo posn: 319 137 normalize: 1)
			)
			((IsFlag 328)
				(= local3 (gEgo cycleSpeed:))
				(gEgo
					view: 7
					setLoop: 3 1
					cel: 0
					posn: 234 47
					setSpeed: 15
					setCycle: Walk
				)
			)
			((IsFlag 330)
				(= local3 (gEgo cycleSpeed:))
				(gEgo
					view: 17
					setLoop: 0 1
					setCel: 6
					posn: 234 47
					setSpeed: 6
					setPri: 75
					setCycle: 0
				)
			)
			(else
				(gEgo posn: 144 127 normalize: 2 setPri: 0)
			)
		)
		(gCurRoom
			addObstacle:
				((Polygon new:)
					type: PContainedAccess
					init: 49 151 83 151 83 155 51 168 19 168 14 173 14 188 111 188 120 167 190 167 210 187 319 187 319 162 286 149 294 149 294 144 274 144 249 136 249 129 220 129 206 143 151 143 151 138 137 138 137 143 49 143
					yourself:
				)
		)
		(if (and (not (IsFlag 200)) global255 global256)
			(blackBird init: approachVerbs: 1) ; Look
		)
		(if (not (IsFlag 138))
			(domovoi init: setPri: 167)
		)
		(if (IsFlag 362)
			(brokenGlass1 init: setPri: 160)
			(brokenGlass2 init:)
		)
		(secretDoor init:)
		(if (== gPrevRoomNum 780)
			(secretDoor cel: (secretDoor lastCel:) setPri: 17)
		else
			(secretDoor hide:)
		)
		(hector init:)
		(mainDoor init:)
		(unknown_360_26 init: approachVerbs: 4) ; Do
		(unknown_360_27 init: approachVerbs: 4) ; Do
		(unknown_360_28 init: approachVerbs: 4 80 28 42) ; Do, openSpell, theLockpick, theToolkit
		(unknown_360_29 init: approachVerbs: 4) ; Do
		(unknown_360_30 init: approachVerbs: 4) ; Do
		(unknown_360_31 init:)
		(unknown_360_32 init:)
		(unknown_360_33 init: approachVerbs: 4) ; Do
		(unknown_360_34 init: approachVerbs: 4) ; Do
		(unknown_360_35 init: approachVerbs: 4) ; Do
		(unknown_360_36 init: approachVerbs: 4) ; Do
		(unknown_360_37 init: approachVerbs: 4) ; Do
		(unknown_360_38 init: approachVerbs: 4) ; Do
		(unknown_360_39 init: approachVerbs: 4) ; Do
		(unknown_360_40 init: approachVerbs: 4) ; Do
		(unknown_360_41 init: approachVerbs: 4) ; Do
		(unknown_360_42 init: approachVerbs: 4) ; Do
		(unknown_360_43 init: approachVerbs: 4) ; Do
		(unknown_360_44 init: approachVerbs: 4) ; Do
		(unknown_360_45 init: approachVerbs: 4) ; Do
		(unknown_360_46 init: approachVerbs: 4) ; Do
		(unknown_360_47 init: approachVerbs: 4) ; Do
		(unknown_360_48 init: approachVerbs: 4) ; Do
		(unknown_360_49 init: approachVerbs: 4) ; Do
		(unknown_360_50 init: approachVerbs: 4) ; Do
		(super init: &rest)
		(cond
			((== gPrevRoomNum 780)
				(self setScript: sFromBasement)
			)
			((IsFlag 328)
				(self setScript: sClimbDown)
			)
			((IsFlag 330)
				(self setScript: sLeviDown)
			)
			(else
				(self setScript: sEnterRoom)
			)
		)
		(gGlory save: 1)
	)

	(method (doit)
		(if (and (== (gCurRoom script:) (ScriptID 31 1)) (>= (gEgo z:) 81)) ; sLevitate
			(gCurRoom setScript: sLevitating)
		)
		(super doit: &rest)
	)

	(method (dispose)
		(local10 dispose:)
		(local9 dispose:)
		(super dispose:)
	)

	(method (doVerb theVerb)
		(switch theVerb
			(81 ; detectMagicSpell
				(if (IsFlag 138)
					(gMessager say: 0 81 10) ; "You sense a low level of magic all around you as if many arcane and unpleasant activities have occurred here in the past. The hexapodal carving above the fireplace is actually an enchanted creature!"
				else
					(super doVerb: theVerb)
				)
			)
			(89 ; levitateSpell
				(if (or (IsFlag 328) (IsFlag 330))
					((ScriptID 31 0) init: 234 128 95 0 3) ; leviCode
				else
					(gMessager say: 27 4 5) ; "The window seems to be secured by a bar on the outside, probably because it is almost inaccessible from the inside. You can't go out that way."
				)
			)
			(83 ; dazzleSpell
				(gCurRoom setScript: sCastDazzle)
			)
			(85 ; calmSpell
				(gMessager say: 0 85 0) ; "That didn't seem to do much. The aura of expectant waiting and hunger still fills the room."
			)
			(95 ; invisibleSpell
				(gMessager say: 0 95 0) ; "Oh, not to worry. Nothing here will attack you while you're standing still."
			)
			(103 ; Sleep 1 hour or less
				(gMessager say: 0 103 0) ; "This place makes your skin crawl. You don't want to rest here, or even to remain here a minute more than you must."
			)
			(40 ; theGarlic
				(if (IsFlag 201)
					(gMessager say: 0 40 17) ; "There's nothing here you can do with garlic anymore."
				else
					(super doVerb: theVerb)
				)
			)
			(10 ; Jump
				(gMessager say: 0 159 0) ; "It's understandable that this place makes you a bit jumpy, but that isn't going to help here."
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)

	(method (newRoom newRoomNumber)
		(gLongSong fade: 0)
		(super newRoom: newRoomNumber &rest)
	)
)

(instance sCastDazzle of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(self setScript: (ScriptID 12) self 83) ; castAreaScript
			)
			(1
				(Palette 2 0 255 500) ; PalIntensity
				(Palette 2 0 255 100) ; PalIntensity
				(gMessager say: 0 83 0 0 self) ; "The brief light helps brighten your spirits for a moment, but leaves you feeling even more depressed afterwards. This is not a nice place!"
			)
			(2
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sLevitating of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gEgo posn: (gEgo x:) 33)
				(= cycles 6)
			)
			(1
				(ClearFlag 328)
				(SetFlag 330)
				(gCurRoom newRoom: 250)
			)
		)
	)
)

(instance sLeviWall of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gEgo setMotion: PolyPath 234 128 self)
			)
			(1
				(gLongSong2 number: 941 play:)
				(gEgo
					view: 17
					loop: 3
					cel: 0
					setPri: 75
					setSpeed: 6
					useMana: 7
					setCycle: End self
				)
			)
			(2
				(sparklies init: setCycle: Fwd)
				(gEgo
					view: 17
					setLoop: 3 1
					setCel: 5
					setPri: 75
					setCycle: 0
					setMotion: MoveTo 234 47 self
				)
			)
			(3
				(ClearFlag 328)
				(SetFlag 330)
				(gCurRoom newRoom: 250)
			)
		)
	)
)

(instance sLeviDown of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(sparklies init: setCycle: Fwd)
				(= cycles 1)
			)
			(1
				(gLongSong number: 360 setLoop: -1 play:)
				(gEgo
					useMana: 7
					solvePuzzle: 434 6
					setMotion: MoveTo 234 128 self
				)
			)
			(2
				(sparklies dispose:)
				(gEgo view: 17 loop: 0 cel: 6 setPri: 75 setCycle: Beg self)
			)
			(3
				(gEgo normalize: 3 setSpeed: local3)
				(= cycles 2)
			)
			(4
				(gEgo setHeading: 180 self)
			)
			(5
				(gEgo setMotion: MoveTo 234 138 self)
			)
			(6
				(if (not (IsFlag 329))
					(gMessager say: 26 6 4 0) ; "You have a really bad feeling about this place. It looks ordinary enough, but the symbols of the Dark One everywhere and the general atmosphere make you almost want to turn and run as fast as you can."
					(if (== gHeroType 3) ; Paladin
						(gMessager say: 26 6 18 0) ; "Danger? How about a sense of all-pervading evil, a sense that you are being watched by otherworldly forces that mean to do you harm. Other than that it's just your basic monastery of a fanatical cult."
					)
					(SetFlag 329)
				)
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sOpenSecretDoor of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gEgo view: 31 loop: 0 cel: 0 setCycle: CT 1 1 self)
			)
			(1
				(gEgo solvePuzzle: 435 6)
				(secretDoor show: setPri: 17 setCycle: End self)
			)
			(2
				(gEgo setCycle: Beg self)
			)
			(3
				(gEgo normalize: 6 setMotion: MoveTo 292 140 self)
			)
			(4
				(gEgo setMotion: MoveTo 319 137 self)
			)
			(5
				(gCurRoom newRoom: 780)
			)
		)
	)
)

(instance sFromBasement of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gLongSong number: 360 setLoop: -1 play:)
				(gEgo setMotion: MoveTo 292 140 self)
			)
			(1
				(gEgo setMotion: MoveTo 275 160 self)
			)
			(2
				(secretDoor setCycle: Beg self)
			)
			(3
				(if (IsFlag 41)
					(= next sEgoRuns)
				)
				(secretDoor hide:)
				(gEgo setPri: -1)
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sSetFire of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(SetFlag 41)
				(gEgo addHonor: 500)
				(if register
					(= cycles 1)
				else
					(gEgo setMotion: PolyPath 216 152 self)
				)
			)
			(1
				(if register
					(= cycles 1)
				else
					(gEgo
						view: 4
						loop: 0
						cel: 0
						posn: 213 150
						setCycle: End self
					)
				)
			)
			(2
				(gMessager say: 26 6 9 0 self) ; "The flame quickly catches in the dessicated rug and spreads to the curtains and the furniture. You'd better get out of here quickly!"
			)
			(3
				(if register
					(= cycles 1)
				else
					(gEgo setCycle: Beg self)
				)
			)
			(4
				(if (not register)
					(gEgo posn: 216 152)
				)
				(gEgo normalize: 0 setScript: sEgoRuns)
				(local9
					at: 0 ((fire new:) init: setCycle: CT 2 1 self yourself:)
				)
			)
			(5
				((local9 at: 0) setCycle: CT 1 -1 self)
			)
			(6
				((local9 at: 0) setCycle: CT 2 1 self)
			)
			(7
				(if (not local0)
					(-= state 2)
				)
				(= cycles 1)
			)
			(8
				((local9 at: 0) setCycle: FireCycle 999 1 self)
			)
			(9
				(local9
					at:
						1
						((fire new:)
							loop: 5
							posn: 161 145
							init:
							setCycle: FireCycle 999 1 self
							yourself:
						)
				)
			)
			(10
				(local9
					at:
						2
						((fire new:)
							loop: 6
							posn: 94 154
							init:
							setCycle: FireCycle 999 1 self
							yourself:
						)
				)
			)
			(11
				(local9
					at:
						3
						((fire new:)
							loop: 2
							posn: 79 164
							init:
							setCycle: FireCycle 999 1 self
							yourself:
						)
				)
			)
			(12
				(local9
					at:
						4
						((fire new:)
							loop: 3
							posn: 79 164
							init:
							setCycle: FireCycle 999 1 self
							yourself:
						)
				)
			)
			(13
				(local9
					at:
						5
						((fire new:)
							loop: 1
							posn: 96 187
							init:
							setCycle: FireCycle 999 1 self
							yourself:
						)
				)
			)
			(14
				(gCurRoom newRoom: 250)
			)
		)
	)
)

(instance sEgoRuns of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(= local0 1)
				(= local7 gEgoGait)
				(if (mainDoor heading:)
					((mainDoor heading:) dispose:)
					(mainDoor heading: 0)
				)
				(= cycles 1)
			)
			(1
				(gEgo changeGait: 1) ; running
				(cond
					((IsFlag 328)
						(sClimbWall register: 0)
						(= next sClimbWall)
					)
					((IsFlag 330)
						(= next sLeviWall)
					)
					(else
						(= next sExitRoom)
					)
				)
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sEnterRoom of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(= seconds 2)
			)
			(1
				(gLongSong number: 360 setLoop: -1 play:)
				(gEgo solvePuzzle: 434 6)
				(gEgo setPri: -1 setMotion: MoveTo 144 149 self)
			)
			(2
				(if (not (IsFlag 329))
					(gMessager say: 26 6 4 0) ; "You have a really bad feeling about this place. It looks ordinary enough, but the symbols of the Dark One everywhere and the general atmosphere make you almost want to turn and run as fast as you can."
					(if (== gHeroType 3) ; Paladin
						(gMessager say: 26 6 18 0) ; "Danger? How about a sense of all-pervading evil, a sense that you are being watched by otherworldly forces that mean to do you harm. Other than that it's just your basic monastery of a fanatical cult."
					)
					(SetFlag 329)
				)
				(mainDoor setCycle: Beg self)
			)
			(3
				(gLongSong2 number: 961 loop: 1 play:)
				(= seconds 2)
			)
			(4
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sExitRoom of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gEgo setMotion: PolyPath 145 143 self)
			)
			(1
				(gEgo setHeading: 0 self)
			)
			(2
				(gLongSong2 number: 960 loop: 1 play:)
				(mainDoor setCycle: End self)
			)
			(3
				(gEgo setPri: 0 setMotion: MoveTo 144 127 self)
			)
			(4
				(if local7
					(gEgo changeGait: local7)
				)
				(gCurRoom newRoom: 250)
			)
		)
	)
)

(instance sRehydrateDomo of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(SetFlag 138)
				(gEgo use: 32) ; theRehydrator
				(gEgo setMotion: PolyPath 59 177 self)
			)
			(1
				(= local3 (gEgo cycleSpeed:))
				(gEgo
					solvePuzzle: 440 6
					view: 31
					loop: 1
					cel: 0
					posn: 59 177
					cycleSpeed: 9
					setCycle: CT 2 1 self
				)
			)
			(2
				(gEgo setCycle: DomoCycle 0 -1 self)
			)
			(3
				(= cycles 2)
			)
			(4
				(gEgo
					view: 4
					loop: 1
					cel: 0
					posn: 63 176
					setCycle: DomoCycle 4 1 self
				)
			)
			(5
				(gEgo setCycle: Beg self)
			)
			(6
				(domovoi setCycle: Beg self)
			)
			(7
				(gMessager say: 23 6 10 0 self) ; "Very wet, be I. Very wet, and very alive."
			)
			(8
				(domovoi dispose:)
				(gEgo normalize: 1 setSpeed: local3)
				(= seconds 2)
			)
			(9
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sClimbWall of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gEgo setMotion: PolyPath 234 128 self)
			)
			(1
				(= local3 (gEgo cycleSpeed:))
				(if (or (IsFlag 41) (== (gEgo trySkill: 11 250) 1)) ; climbing
					(self changeState: 5)
				else
					(= cycles 1)
				)
			)
			(2
				(gEgo
					view: 7
					setLoop: 3 1
					cel: 0
					setSpeed: 15
					setCycle: Walk
					setMotion: MoveTo 234 110 self
				)
			)
			(3
				(gEgo setSpeed: 4 setCycle: 0 setMotion: MoveTo 234 128 self)
			)
			(4
				(= state 17)
				(gMessager say: 26 6 6 0 self) ; "You need to work more on your climbing. This wall is rather tricky."
			)
			(5
				(gEgo
					view: 7
					setLoop: 3 1
					cel: 0
					setSpeed: 15
					setCycle: Walk
					setMotion: MoveTo 234 47 self
				)
			)
			(6
				(gEgo setMotion: MoveTo 221 47 self)
			)
			(7
				(gEgo normalize: 1 setSpeed: 9)
				(if (== register 2)
					(self changeState: 11)
				else
					(= cycles 1)
				)
			)
			(8
				(gEgo setMotion: MoveTo 198 44 self)
			)
			(9
				(gEgo setHeading: 0 self)
			)
			(10
				(if local7
					(gEgo changeGait: local7)
				)
				(gEgo setSpeed: local3)
				(ClearFlag 330)
				(SetFlag 328)
				(gCurRoom newRoom: 250)
			)
			(11
				(gEgo setMotion: MoveTo 166 38 self)
			)
			(12
				(gEgo
					view: 4
					loop: 1
					cel: 0
					posn: 167 38
					setCycle: CT 3 1 self
				)
			)
			(13
				(blackBird dispose:)
				(SetFlag 200)
				(gEgo get: 34 solvePuzzle: 506 6 4 setCycle: CT 0 -1 self) ; theBlackbird
			)
			(14
				(gMessager say: 24 4 7 0 self) ; "Precariously maintaining your balance on the narrow ledge, you just manage to snag the black bird and place it in your pack."
			)
			(15
				(gEgo normalize: 1 setHeading: 90 self)
			)
			(16
				(gEgo setMotion: MoveTo 221 47 self)
			)
			(17
				(gEgo
					view: 7
					setLoop: 3 1
					setSpeed: 15
					setCycle: Walk
					setMotion: MoveTo 234 47 self
				)
			)
			(18
				(gEgo setMotion: MoveTo 234 128 self)
			)
			(19
				(if (not local0)
					(gEgo normalize: 3 setSpeed: local3)
				else
					(gEgo hide:)
				)
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sClimbDown of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(= cycles 2)
			)
			(1
				(gLongSong number: 360 setLoop: -1 play:)
				(gEgo setMotion: MoveTo 234 128 self)
				(gEgo solvePuzzle: 434 6)
			)
			(2
				(gEgo normalize: 3 setSpeed: local3)
				(= cycles 2)
			)
			(3
				(gEgo setHeading: 180 self)
			)
			(4
				(gEgo setMotion: MoveTo 234 138 self)
			)
			(5
				(if (not (IsFlag 329))
					(gMessager say: 26 6 4 0) ; "You have a really bad feeling about this place. It looks ordinary enough, but the symbols of the Dark One everywhere and the general atmosphere make you almost want to turn and run as fast as you can."
					(if (== gHeroType 3) ; Paladin
						(gMessager say: 26 6 18 0) ; "Danger? How about a sense of all-pervading evil, a sense that you are being watched by otherworldly forces that mean to do you harm. Other than that it's just your basic monastery of a fanatical cult."
					)
					(SetFlag 329)
				)
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sBustGlass of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gMessager say: 20 4 13 0 self) ; "You break the glass cabinet open, making a big mess. The only useful item inside is a flask labeled "Healing," which you take for later use."
			)
			(1
				(brokenGlass1 init: setPri: 160)
				(brokenGlass2 init:)
				(SetFlag 362)
				(gEgo get: 3) ; theHeals
				(= cycles 2)
			)
			(2
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sHectorAct of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(hector loop: 0 setCycle: End self)
			)
			(1
				(hector loop: 1 setCycle: Fwd)
				(= seconds 3)
			)
			(2
				(if register
					(hector setCycle: End self)
				else
					(gMessager say: 26 6 11 0 self) ; "That's funny; the strange six-tentacled creature is moving! It looked like another wall decoration at first."
				)
			)
			(3
				(if register
					(gEgo setMotion: MoveTo (gEgo x:) (gEgo y:))
					(hector
						x: 279
						y: 62
						setLoop: 2 1
						setPri: 221
						xStep: 4
						yStep: 6
						moveSpeed: 3
						setCycle: End
						setMotion:
							MoveTo
							(- (gEgo x:) 3)
							(- (gEgo y:) 40)
							self
					)
				else
					(= local4 1)
					(hector loop: 0 cel: 1 setCycle: Beg self)
					(gEgo setMotion: PolyPath 205 148 self)
				)
			)
			(4
				(if register
					(EgoDead 12 0 978 1 912)
				else
					0
				)
			)
			(5
				(gEgo setHeading: 90 self)
			)
			(6
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sKillHector of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(if register
					(gGlory handsOff:)
				)
				(hector loop: 0 setCycle: End self)
			)
			(1
				(hector loop: 1 setCycle: End self)
			)
			(2
				(hector loop: 0 cel: 1 setCycle: Beg self)
			)
			(3
				(if register
					(SetFlag 201)
					(gEgo addHonor: -100)
					(gMessager say: 26 6 19 0 self) ; "After you bombard the poor creature for a bit, it dies. Poor Hector."
				else
					(gMessager say: 28 local6 0 0 self)
				)
			)
			(4
				(if (and register local8)
					(if (== local8 1)
						(gEgo get: 5) ; theThrowdagger
						(gMessager say: 29 4 22) ; "You pick up the dagger and put it in your backpack."
					else
						(gEgo get: 5 local8) ; theThrowdagger
						(gMessager say: 29 4 23) ; "You retrieve your daggers."
					)
					(= local8 0)
				)
				(= cycles 1)
			)
			(5
				(if register
					(gGlory handsOn:)
				)
				(self dispose:)
			)
		)
	)
)

(instance brokenGlass1 of View
	(properties
		sightAngle 180
		x 55
		y 127
		view 360
	)
)

(instance brokenGlass2 of View
	(properties
		sightAngle 180
		x 56
		y 127
		view 360
		cel 1
	)
)

(instance blackBird of TargProp
	(properties
		noun 24
		sightAngle 180
		approachX 144
		approachY 149
		x 145
		y 33
		z 10
		view 360
		loop 1
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(gCurRoom setScript: sClimbWall 0 2)
			)
			(87 ; fetchSpell
				(= global441 147)
				(= global442 25)
				(gCurRoom setScript: (ScriptID 37) 0 self) ; castFetchScript
			)
			(-87 ; fetchSpell (part 2)
				(SetFlag 200)
				(gEgo get: 34 solvePuzzle: 506 6 4) ; theBlackbird
				(self hide:)
				(gMessager say: 24 87 0) ; "Your Fetch spell neatly snags the black bird, saving you a dangerous balancing act on the ledge. You carefully put the falcon statue away in your pack."
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance mainDoor of Prop
	(properties
		noun 14
		sightAngle 180
		approachX 145
		approachY 144
		x 146
		y 85
		view 360
		loop 3
	)

	(method (init)
		(if (and (not (IsFlag 328)) (not (IsFlag 330)) (== gPrevRoomNum 250))
			(= cel 7)
		)
		(super init: &rest)
		(if (and (not (IsFlag 328)) (not (IsFlag 330)))
			(= heading
				(((ScriptID 49 0) new:) ; doorMat
					init:
						((Polygon new:)
							type: PNearestAccess
							init: 153 136 153 142 135 142 135 136
							yourself:
						)
						6
						3
						7
						sExitRoom
					yourself:
				)
			)
		)
	)

	(method (dispose)
		(if (and (not (IsFlag 328)) (not (IsFlag 330)) heading)
			(heading dispose:)
		)
		(super dispose: &rest)
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(if (or (IsFlag 328) (IsFlag 330))
					(gMessager say: 14 4 5) ; "The door is firmly sealed as if cemented in place. Either it really has been bricked in or some very powerful magic keeps it locked."
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance sparklies of Prop
	(properties
		priority 182
		fixPriority 1
		view 17
		loop 4
		signal 16385
	)

	(method (init)
		(self setScaler: gEgo)
		(super init: &rest)
	)

	(method (doit)
		(= x (gEgo x:))
		(= y (gEgo y:))
		(super doit: &rest)
	)
)

(instance secretDoor of Prop
	(properties
		noun 10
		sightAngle 180
		x 299
		y 142
		view 361
		signal 16385
	)
)

(instance domovoi of Prop
	(properties
		noun 23
		sightAngle 180
		x 59
		y 139
		view 366
		loop 2
		cel 10
		signal 16385
	)

	(method (doVerb theVerb)
		(switch theVerb
			(51 ; theRehydrator
				(gCurRoom setScript: sRehydrateDomo)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance fire of Prop
	(properties
		x 241
		y 130
		view 362
		signal 16385
	)
)

(instance hector of TargActor
	(properties
		noun 28
		sightAngle 90
		x 288
		y 76
		view 368
		signal 16385
	)

	(method (doit)
		(if
			(and
				(not (IsFlag 201))
				(not (gCurRoom script:))
				(<= (GetDistance (gEgo x:) (gEgo y:) 307 137) 50)
			)
			(if local4
				(gCurRoom setScript: sHectorAct 0 1)
			else
				(gCurRoom setScript: sHectorAct 0 0)
			)
		)
		(super doit: &rest)
	)

	(method (doVerb theVerb)
		(cond
			((== theVerb 40) ; theGarlic
				(if (IsFlag 201)
					(gMessager say: 26 6 20) ; "There's no reason to do that; the hexapod isn't even moving."
				else
					(gEgo use: 22) ; theGarlic
					(SetFlag 201)
					(super doVerb: theVerb &rest)
				)
			)
			((OneOf theVerb 37 86 88 79 93 21) ; theThrowdagger, flameDartSpell, forceBoltSpell, frostSpell, lightningBallSpell, theRocks
				(cond
					((IsFlag 201)
						(gMessager say: 26 6 20) ; "There's no reason to do that; the hexapod isn't even moving."
					)
					((and (== theVerb 37) (== ((gInventory at: 5) amount:) 1)) ; theThrowdagger, theThrowdagger
						(gMessager say: 26 6 24) ; "You are down to your last dagger. You'd better hold on to it."
					)
					(else
						(if (== theVerb 37) ; theThrowdagger
							(++ local8)
						)
						(gCurRoom
							setScript: (ScriptID 32) self (= local6 theVerb) ; project
						)
					)
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)

	(method (getHurt param1 param2)
		(if (<= (-= local5 param2) 0)
			(self setScript: sKillHector 0 1)
		else
			(self setScript: sKillHector 0 0)
		)
	)
)

(instance unknown_360_26 of Feature
	(properties
		noun 22
		nsLeft 163
		nsTop 147
		nsRight 205
		nsBottom 189
		sightAngle 180
		x 184
		y 168
	)
)

(instance unknown_360_27 of Feature
	(properties
		noun 21
		nsLeft 113
		nsTop 152
		nsRight 164
		nsBottom 189
		sightAngle 180
		x 138
		y 170
	)
)

(instance unknown_360_28 of Feature
	(properties
		noun 20
		nsLeft 19
		nsTop 92
		nsRight 68
		nsBottom 164
		sightAngle 180
		approachX 72
		approachY 165
		x 43
		y 128
	)

	(method (handleEvent event)
		(if (== (event message:) KEY_P)
			(= approachX 114)
			(= approachY 161)
		else
			(= approachX 72)
			(= approachY 165)
		)
		(super handleEvent: event &rest)
	)

	(method (doVerb theVerb)
		(cond
			((== theVerb 1) ; Look
				(cond
					((IsFlag 362)
						(gMessager say: 20 1 1) ; "This was once a very nicely made cabinet. Now it's a rather broken one. Apparently vandals have been at work here."
					)
					((IsFlag 202)
						(gMessager say: 20 1 2) ; "There is nothing else of value in the cabinet."
					)
					(else
						(gMessager say: 20 1 3) ; "This is a fairly attractive (in a baroque way) display cabinet with a glass door."
					)
				)
			)
			((and (or (IsFlag 362) (IsFlag 202)) (OneOf theVerb 42 4 80)) ; theToolkit, Do, openSpell
				(gMessager say: 20 4 16) ; "There is nothing else of value in the cabinet."
			)
			((== theVerb 4) ; Do
				(if (> gEgoStats 300)
					(if (== gHeroType 3) ; Paladin
						(gMessager say: 20 4 14) ; "You don't think you should break someone else's property; it just isn't the honorable thing to do."
					else
						(gCurRoom setScript: sBustGlass)
					)
				else
					(gMessager say: 20 4 15) ; "You strike a mighty hammer blow at the glass case. It just sort of looks at you through its "glass eye." You need to either build up your strength or try another approach."
				)
			)
			((OneOf theVerb 42 28) ; theToolkit, theLockpick
				(gEgo trySkill: 9 get: 3) ; pick locks, theHeals
				(SetFlag 202)
				(super doVerb: theVerb &rest)
			)
			((== theVerb 80) ; openSpell
				(if (gEgo castSpell: 20)
					(= global441 57)
					(= global442 114)
					(gCurRoom setScript: (ScriptID 13 0) 0 self) ; castOpenScript
				)
			)
			((== theVerb -80) ; openSpell (part 2)
				(gCurRoom setScript: 0)
				(gGlory handsOn:)
				(SetFlag 202)
				(gEgo get: 3) ; theHeals
				(gMessager say: 20 80 0) ; "Your Open spell easily springs the cabinet lock. You take the Healing Potion you find inside."
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance unknown_360_29 of Feature
	(properties
		noun 19
		nsLeft 35
		nsRight 87
		nsBottom 27
		sightAngle 180
		x 61
		y 13
	)
)

(instance unknown_360_30 of Feature
	(properties
		noun 19
		nsLeft 235
		nsRight 295
		nsBottom 35
		sightAngle 180
		x 265
		y 17
	)
)

(instance unknown_360_31 of Feature
	(properties
		noun 17
		nsLeft 86
		nsRight 112
		nsBottom 27
		sightAngle 180
		x 99
		y 13
	)

	(method (doVerb theVerb)
		(unknown_360_32 doVerb: theVerb &rest)
	)
)

(instance unknown_360_32 of Feature
	(properties
		noun 16
		nsLeft 183
		nsTop -1
		nsRight 212
		nsBottom 38
		sightAngle 180
		x 197
		y 18
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(if (or (IsFlag 328) (IsFlag 330))
					(gCurRoom setScript: sClimbWall 0 1)
				else
					(gMessager say: 27 4 5) ; "The window seems to be secured by a bar on the outside, probably because it is almost inaccessible from the inside. You can't go out that way."
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance unknown_360_33 of Feature
	(properties
		noun 15
		nsLeft 75
		nsTop 58
		nsRight 89
		nsBottom 73
		sightAngle 180
		x 82
		y 65
	)
)

(instance unknown_360_34 of Feature
	(properties
		noun 15
		nsLeft 202
		nsTop 65
		nsRight 217
		nsBottom 78
		sightAngle 180
		x 209
		y 71
	)
)

(instance unknown_360_35 of Feature
	(properties
		noun 14
		nsLeft 125
		nsTop 87
		nsRight 169
		nsBottom 129
		sightAngle 180
		x 147
		y 108
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(if (or (IsFlag 328) (IsFlag 330))
					(gMessager say: 14 4 5) ; "The door is firmly sealed as if cemented in place. Either it really has been bricked in or some very powerful magic keeps it locked."
				else
					(gCurRoom setScript: sExitRoom)
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance unknown_360_36 of Feature
	(properties
		noun 13
		nsLeft 144
		nsTop 19
		nsRight 152
		nsBottom 31
		sightAngle 180
		approachX 234
		approachY 128
		x 148
		y 25
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(if (and (not (IsFlag 200)) global255 global256)
					(gCurRoom setScript: sClimbWall 0 2)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance unknown_360_37 of Feature
	(properties
		noun 12
		nsLeft 268
		nsTop 118
		nsRight 278
		nsBottom 141
		sightAngle 180
		x 273
		y 129
	)
)

(instance unknown_360_38 of Feature
	(properties
		noun 11
		nsLeft 301
		nsTop 124
		nsRight 313
		nsBottom 150
		sightAngle 180
		approachX 289
		approachY 158
		x 307
		y 137
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(if (IsFlag 201)
					(if (not (IsFlag 319))
						(gMessager say: 11 4 0) ; "As you push and pull at the antique log holder, suddenly it turns in your hand and the whole back of the fireplace opens to reveal a secret passage leading down! No wonder the fireplace didn't appear to have been used much."
					)
					(gCurRoom setScript: sOpenSecretDoor)
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance unknown_360_39 of Feature
	(properties
		noun 10
		nsLeft 266
		nsTop 83
		nsRight 314
		nsBottom 150
		sightAngle 180
		x 290
		y 116
	)
)

(instance unknown_360_40 of Feature
	(properties
		noun 9
		nsLeft 93
		nsTop 34
		nsRight 110
		nsBottom 45
		sightAngle 180
		x 101
		y 39
	)
)

(instance unknown_360_41 of Feature
	(properties
		noun 8
		nsLeft 122
		nsTop 36
		nsRight 139
		nsBottom 48
		sightAngle 180
		x 130
		y 42
	)
)

(instance unknown_360_42 of Feature
	(properties
		noun 7
		nsLeft 149
		nsTop 39
		nsRight 158
		nsBottom 49
		sightAngle 180
		x 153
		y 44
	)
)

(instance unknown_360_43 of Feature
	(properties
		noun 6
		nsLeft 166
		nsTop 40
		nsRight 184
		nsBottom 50
		sightAngle 180
		x 175
		y 45
	)
)

(instance unknown_360_44 of Feature
	(properties
		noun 5
		nsLeft 192
		nsTop 43
		nsRight 207
		nsBottom 52
		sightAngle 180
		x 199
		y 47
	)
)

(instance unknown_360_45 of Feature
	(properties
		noun 4
		nsLeft 53
		nsTop 70
		nsRight 75
		nsBottom 93
		sightAngle 180
		x 64
		y 81
	)
)

(instance unknown_360_46 of Feature
	(properties
		noun 4
		nsLeft 224
		nsTop 73
		nsRight 244
		nsBottom 98
		sightAngle 180
		x 234
		y 85
	)
)

(instance unknown_360_47 of Feature
	(properties
		noun 3
		nsLeft 216
		nsTop 10
		nsRight 234
		nsBottom 40
		sightAngle 180
		x 225
		y 25
	)
)

(instance unknown_360_48 of TargFeature
	(properties
		noun 2
		nsLeft 15
		nsRight 42
		nsBottom 87
		sightAngle 180
		x 28
		y 43
	)

	(method (doVerb theVerb)
		(if (OneOf theVerb 39 76) ; theFlint, theTorch
			(if (and (IsFlag 138) (IsFlag 233))
				(gMessager say: 26 6 21) ; "If it's pyromania you intend, that wispy dry rug looks like the best place to start."
			else
				(gMessager say: 2 39 0) ; "That's a good idea, but you have some unfinished business to tend to in here first."
			)
		else
			(super doVerb: theVerb &rest)
		)
	)

	(method (getHurt)
		(gCurRoom setScript: sSetFire 0 1)
	)
)

(instance unknown_360_49 of Feature
	(properties
		noun 1
		nsLeft 273
		nsTop 47
		nsRight 290
		nsBottom 74
		sightAngle 180
		x 281
		y 60
	)
)

(instance unknown_360_50 of TargFeature
	(properties
		noun 25
		nsLeft 51
		nsTop 150
		nsRight 318
		nsBottom 189
		sightAngle 180
		x 184
		y 169
	)

	(method (doVerb theVerb)
		(cond
			((OneOf theVerb 39 76) ; theFlint, theTorch
				(if
					(and
						(IsFlag 138)
						(IsFlag 233)
						(or (gEgo has: 53) ((gInventory at: 53) chestAmout:)) ; theBloodRit, theBloodRit
					)
					(gCurRoom setScript: sSetFire)
				else
					(super doVerb: theVerb &rest)
				)
			)
			((== theVerb 4) ; Do
				(if local8
					(if (== local8 1)
						(gEgo get: 5) ; theThrowdagger
						(gMessager say: 29 4 22) ; "You pick up the dagger and put it in your backpack."
					else
						(gEgo get: 5 local8) ; theThrowdagger
						(gMessager say: 29 4 23) ; "You retrieve your daggers."
					)
					(= local8 0)
				else
					(super doVerb: theVerb)
				)
			)
			((== theVerb 86) ; flameDartSpell
				(if
					(and
						(IsFlag 138)
						(IsFlag 233)
						(or (gEgo has: 53) ((gInventory at: 53) chestAmout:)) ; theBloodRit, theBloodRit
					)
					(if (gEgo castSpell: 26)
						(= global441 232)
						(= global442 147)
						(gEgo setScript: (ScriptID 32) 0 86) ; project
					)
				else
					(super doVerb: theVerb)
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)

	(method (getHurt)
		(gCurRoom setScript: sSetFire 0 1)
	)
)

(class FireCycle of CT
	(properties
		nsRight {FireCycle}
		cueFlag 0
	)

	(method (doit &tmp temp0 temp1)
		(if (> endCel (= temp1 (client lastCel:)))
			(= endCel temp1)
		)
		(= temp0 (self nextCel:))
		(client
			cel:
				(cond
					((> temp0 temp1) 0)
					((< temp0 0) temp1)
					(else temp0)
				)
		)
		(if (and (== gGameTime cycleCnt) (not cueFlag) (== endCel (client cel:)))
			(= cueFlag 1)
			(caller cue:)
		)
	)

	(method (nextCel)
		(return
			(if (< (Abs (- gGameTime cycleCnt)) (client cycleSpeed:))
				(client cel:)
			else
				(= cycleCnt gGameTime)
				(if (== (client cel:) (client lastCel:))
					(- (client cel:) 1)
				else
					(+ (client cel:) cycleDir)
				)
			)
		)
	)
)

(instance DomoCycle of CT
	(properties)

	(method (nextCel)
		(if (< (Abs (- gGameTime cycleCnt)) (client cycleSpeed:))
			(return (client cel:))
		else
			(domovoi posn: (local10 at: local1) (local10 at: (+ local1 1)))
			(if (>= local1 8)
				(domovoi setPri: 238)
			)
			(+= local1 2)
			(= cycleCnt gGameTime)
			(return (+ (client cel:) cycleDir))
		)
	)
)

