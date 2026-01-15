;;; Sierra Script 1.0 - (do not remove this comment)
;;; Decompiled by sluicebox
(script# 250)
(include sci.sh)
(use Main)
(use GloryRm)
(use Teller)
(use DeathIcon)
(use Scaler)
(use PolyPath)
(use Polygon)
(use Feature)
(use Motion)
(use Actor)
(use System)

(public
	rm250 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
)

(instance rm250 of GloryRm
	(properties
		picture 250
		east 280
		south 260
	)

	(method (init)
		; DECOMPILER EXCEPTION: Value cannot be null., Parameter name: key
		(asm
			pushi    1
			pushi    41
			callb    IsFlag,  2
			bnt      code_0130
			lsg      gPrevRoomNum
			ldi      360
			eq?
			bnt      code_0130
			ldi      0
			jmp      code_0224
code_0130:
			pushi    1
			pushi    48
			callb    IsFlag,  2
			not
			bnt      code_0157
			pushi    1
			pushi    37
			callb    IsFlag,  2
			bt       code_0152
			pushi    1
			pushi    38
			callb    IsFlag,  2
			bnt      code_0157
code_0152:
			ldi      4
			jmp      code_0224
code_0157:
			pushi    1
			pushi    76
			callb    IsFlag,  2
			not
			bnt      code_0173
			pushi    1
			pushi    48
			callb    IsFlag,  2
			bnt      code_0173
			ldi      5
			jmp      code_0224
code_0173:
			pushi    1
			pushi    76
			callb    IsFlag,  2
			bnt      code_018e
			lsg      gDay
			lsg      global415
			ldi      1
			add
			ge?
			bnt      code_018e
			ldi      6
			jmp      code_0224
code_018e:
			pushi    1
			pushi    74
			callb    IsFlag,  2
			bnt      code_01b3
			pushi    1
			pushi    75
			callb    IsFlag,  2
			bnt      code_01b3
			lsg      gDay
			lsg      global415
			ldi      1
			add
			ge?
			bnt      code_01b3
			ldi      3
			jmp      code_0224
code_01b3:
			lsg      gDay
			lsg      global415
			ldi      1
			add
			ge?
			bnt      code_01d5
			pushi    1
			pushi    74
			callb    IsFlag,  2
			bnt      code_01d5
			pushi    1
			pushi    75
			callb    IsFlag,  2
			not
			bt       code_01f3
code_01d5:
			pushi    1
			pushi    74
			callb    IsFlag,  2
			bnt      code_01f7
			pushi    1
			pushi    75
			callb    IsFlag,  2
			bnt      code_01f7
			lsg      global415
			lag      gDay
			eq?
			bnt      code_01f7
code_01f3:
			ldi      2
			jmp      code_0224
code_01f7:
			lsg      global415
			ldi      0
			eq?
			bt       code_021e
			pushi    1
			pushi    74
			callb    IsFlag,  2
			bnt      code_0222
			pushi    1
			pushi    75
			callb    IsFlag,  2
			not
			bnt      code_0222
			lsg      global415
			lag      gDay
			eq?
			bnt      code_0222
code_021e:
			ldi      1
			jmp      code_0224
code_0222:
			ldi      7
code_0224:
			sal      local2
			pushi    3
			lsg      gPrevRoomNum
			pushi    280
			pushi    260
			calle    OneOf,  6
			not
			bnt      code_0251
			pushi    52
			pushi    1
			pushi    250
			pushi    254
			pushi    1
			pushi    -1
			pushi    51
			pushi    0
			lag      gLongSong
			send     16
code_0251:
			pushi    4
			pushi    2
			pushi    66
			pushi    85
			pushi    100
			callk    Palette,  8
			pushi    147
			pushi    0
			pushi    790
			pushi    0
			pushi    332
			pushi    2
			pushi    335
			pushi    240
			pushi    342
			pushi    5
			class    Scaler
			push
			pushi    100
			pushi    79
			pushi    176
			pushi    132
			lag      gEgo
			send     30
			pushi    18
			pushi    1
			pushi    289
			pushi    19
			pushi    1
			pushi    30
			pushi    21
			pushi    1
			pushi    173
			pushi    20
			pushi    1
			pushi    319
			pushi    309
			pushi    1
			pushi    319
			pushi    310
			pushi    1
			pushi    155
			pushi    147
			pushi    0
			pushi    146
			pushi    0
			pushi    2
			pushi    6
			pushi    0
			callk    ScriptID,  4
			send     4
			send     40
			pushi    147
			pushi    0
			pushi    74
			pushi    1
			pushi    0
			pushi    317
			pushi    4
			dup
			pushi    42
			pushi    29
			pushi    80
			lofsa    guildDoor
			send     22
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    unknown_250_36
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    unknown_250_37
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    unknown_250_38
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    unknown_250_39
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    unknown_250_43
			send     10
			lsg      gTime
			ldi      3
			le?
			bnt      code_0362
			pushi    3
			lsl      local2
			pushi    0
			pushi    4
			calle    OneOf,  6
			not
			bt       code_0396
code_0362:
			lsl      local2
			ldi      0
			eq?
			bnt      code_0445
			lsg      gTime
			ldi      3
			le?
			bnt      code_0445
			pushi    1
			pushi    48
			callb    IsFlag,  2
			not
			bnt      code_0392
			pushi    1
			pushi    37
			callb    IsFlag,  2
			bt       code_0392
			pushi    1
			pushi    38
			callb    IsFlag,  2
code_0392:
			not
			bnt      code_0445
code_0396:
			pushi    147
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    2
			pushi    184
			pushi    1
			lofsa    sIgorCarve
			push
			lofsa    igor
			send     18
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    stone
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    shovel
			send     10
			pushi    527
			pushi    1
			pushi    43
			pushi    1
			pushi    2
			pushi    147
			pushi    26
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    144
			pushi    212
			pushi    182
			pushi    78
			pushi    133
			pushi    50
			pushi    136
			pushi    36
			pushi    150
			pushi    4
			pushi    150
			pushi    4
			pushi    171
			pushi    156
			pushi    171
			pushi    174
			pushi    189
			pushi    10
			pushi    189
			pushi    0
			pushi    189
			pushi    153
			pushi    0
			pushi    146
			pushi    0
			class    Polygon
			send     4
			send     66
			push
			lag      gCurRoom
			send     6
			jmp      code_04ac
code_0445:
			pushi    527
			pushi    1
			pushi    43
			pushi    1
			pushi    2
			pushi    147
			pushi    24
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    144
			pushi    212
			pushi    182
			pushi    78
			pushi    133
			pushi    50
			pushi    136
			pushi    4
			pushi    150
			pushi    4
			pushi    171
			pushi    156
			pushi    171
			pushi    174
			pushi    189
			pushi    10
			pushi    189
			pushi    0
			pushi    189
			pushi    153
			pushi    0
			pushi    146
			pushi    0
			class    Polygon
			send     4
			send     62
			push
			lag      gCurRoom
			send     6
code_04ac:
			lsg      gPrevRoomNum
			dup
			ldi      260
			eq?
			bnt      code_04d2
			pushi    332
			pushi    2
			pushi    265
			pushi    240
			lag      gEgo
			send     8
			ldi      216
			sal      local0
			ldi      187
			sal      local1
			jmp      code_05cb
code_04d2:
			dup
			ldi      280
			eq?
			bnt      code_04f6
			pushi    332
			pushi    2
			pushi    335
			pushi    140
			lag      gEgo
			send     8
			ldi      293
			sal      local0
			ldi      162
			sal      local1
			jmp      code_05cb
code_04f6:
			dup
			ldi      360
			eq?
			bnt      code_05bb
			pushi    1
			pushi    328
			callb    IsFlag,  2
			bnt      code_0542
			pushi    14
			pushi    1
			pushi    7
			pushi    254
			pushi    2
			pushi    3
			pushi    1
			pushi    16
			pushi    1
			pushi    0
			pushi    332
			pushi    2
			pushi    135
			pushi    126
			pushi    342
			pushi    5
			class    Scaler
			push
			pushi    89
			pushi    60
			pushi    150
			pushi    120
			lag      gEgo
			send     42
			jmp      code_05cb
code_0542:
			dup
			ldi      360
			eq?
			bnt      code_05bb
			pushi    1
			pushi    330
			callb    IsFlag,  2
			bnt      code_058c
			pushi    14
			pushi    1
			pushi    7
			pushi    254
			pushi    2
			pushi    3
			pushi    1
			pushi    16
			pushi    1
			pushi    0
			pushi    332
			pushi    2
			pushi    135
			pushi    126
			pushi    342
			pushi    5
			class    Scaler
			push
			pushi    89
			pushi    60
			pushi    150
			pushi    120
			lag      gEgo
			send     42
			jmp      code_05cb
code_058c:
			pushi    332
			pushi    2
			pushi    203
			pushi    187
			pushi    74
			pushi    1
			pushi    51
			lag      gEgo
			send     14
			pushi    333
			pushi    1
			pushi    264
			pushi    0
			lofsa    monkDoor
			send     4
			push
			lofsa    monkDoor
			send     6
			jmp      code_05cb
code_05bb:
			pushi    332
			pushi    2
			pushi    172
			pushi    178
			lag      gEgo
			send     8
code_05cb:
			toss
			pushi    1
			pushi    41
			callb    IsFlag,  2
			bnt      code_06a8
			pushi    147
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    unknown_250_35
			send     12
			lsg      gPrevRoomNum
			ldi      360
			eq?
			bnt      code_063d
			pushi    147
			pushi    0
			pushi    74
			pushi    1
			pushi    17
			pushi    317
			pushi    5
			pushi    4
			pushi    28
			pushi    42
			pushi    29
			pushi    43
			lofsa    monkDoor
			send     24
			pushi    147
			pushi    0
			pushi    236
			pushi    1
			class    Fwd
			push
			lofsa    fire1
			send     10
			pushi    147
			pushi    0
			pushi    236
			pushi    1
			class    Fwd
			push
			lofsa    fire2
			send     10
			jmp      code_0784
code_063d:
			pushi    147
			pushi    0
			pushi    74
			pushi    1
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    burntRemains
			send     18
			pushi    147
			pushi    0
			pushi    74
			pushi    1
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    burntRemains1
			send     18
			pushi    147
			pushi    0
			pushi    74
			pushi    1
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    burntRemains2
			send     18
			pushi    147
			pushi    0
			pushi    74
			pushi    1
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    burntRemains3
			send     18
			jmp      code_0784
code_06a8:
			pushi    147
			pushi    0
			pushi    74
			pushi    1
			pushi    17
			pushi    317
			pushi    5
			pushi    4
			pushi    28
			pushi    42
			pushi    29
			pushi    43
			lofsa    monkDoor
			send     24
			pushi    147
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    unknown_250_44
			send     12
			pushi    147
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    unknown_250_45
			send     12
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    unknown_250_46
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    hectMidLtArm
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    hectMidRtArm
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    hectLtArm
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    hectRtArm
			send     10
			pushi    147
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    unknown_250_40
			send     12
			pushi    147
			pushi    0
			pushi    317
			pushi    2
			pushi    4
			pushi    33
			lofsa    unknown_250_41
			send     12
			pushi    147
			pushi    0
			pushi    317
			pushi    1
			pushi    4
			lofsa    unknown_250_42
			send     10
code_0784:
			pushi    147
			pushi    0
			&rest    1
			super    GloryRm,  4
			pushi    159
			pushi    1
			lofsa    igor
			push
			lag      gCast
			send     6
			bnt      code_07f3
			pushi    147
			pushi    5
			lsg      gEgo
			pushi    250
			pushi    16
			pushi    128
			lsl      local2
			dup
			ldi      0
			eq?
			bnt      code_07bb
			ldi      19
			jmp      code_07eb
code_07bb:
			dup
			ldi      1
			eq?
			bnt      code_07c5
			ldi      12
			jmp      code_07eb
code_07c5:
			dup
			ldi      2
			eq?
			bnt      code_07cf
			ldi      11
			jmp      code_07eb
code_07cf:
			dup
			ldi      3
			eq?
			bnt      code_07d9
			ldi      14
			jmp      code_07eb
code_07d9:
			dup
			ldi      5
			eq?
			bnt      code_07e3
			ldi      15
			jmp      code_07eb
code_07e3:
			dup
			ldi      6
			eq?
			bnt      code_07eb
			ldi      13
code_07eb:
			toss
			push
			lofsa    heroTeller
			send     14
code_07f3:
			lsg      gPrevRoomNum
			dup
			ldi      260
			eq?
			bnt      code_080b
			pushi    184
			pushi    1
			lofsa    sEnter
			push
			self     6
			jmp      code_088f
code_080b:
			dup
			ldi      280
			eq?
			bnt      code_0820
			pushi    184
			pushi    1
			lofsa    sEnter
			push
			self     6
			jmp      code_088f
code_0820:
			dup
			ldi      350
			eq?
			bnt      code_0835
			pushi    184
			pushi    1
			lofsa    sOutGuildDoor
			push
			self     6
			jmp      code_088f
code_0835:
			dup
			ldi      360
			eq?
			bnt      code_0885
			pushi    1
			pushi    328
			callb    IsFlag,  2
			bnt      code_0856
			pushi    184
			pushi    1
			lofsa    sClimbOutMonks
			push
			self     6
			jmp      code_088f
code_0856:
			dup
			ldi      360
			eq?
			bnt      code_0885
			pushi    1
			pushi    330
			callb    IsFlag,  2
			bnt      code_0877
			pushi    184
			pushi    1
			lofsa    sLevitateOutMonks
			push
			self     6
			jmp      code_088f
code_0877:
			pushi    184
			pushi    1
			lofsa    sExitMonks
			push
			self     6
			jmp      code_088f
code_0885:
			pushi    537
			pushi    0
			lag      gGlory
			send     4
code_088f:
			toss
			pushi    1
			pushi    41
			callb    IsFlag,  2
			not
			bnt      code_08a7
			pushi    86
			pushi    1
			pushi    1
			lag      gGlory
			send     6
code_08a7:
			ret
		)
	)

	(method (doit)
		(if (< (Abs (- gGameTime local7)) 2)
			(return)
		)
		(= local7 gGameTime)
		(if
			(and
				(== (gCurRoom script:) (ScriptID 31 1)) ; sLevitate
				(>= (gEgo z:) 25)
				(not (IsFlag 41))
			)
			(gCurRoom setScript: sLevitateInMonks)
		)
		(super doit: &rest)
	)

	(method (doVerb theVerb)
		(switch theVerb
			(89 ; levitateSpell
				(if gNight
					((ScriptID 31 0) init: 139 156 35 0 3) ; leviCode
				else
					(gMessager say: 18 6 34) ; "Somebody might see you if you try this during the day!"
				)
			)
			(181 ; ???
				(gMessager say: 0 181 0) ; MISSING MESSAGE
			)
			(59 ; theFlowers
				(gMessager say: 0 14 0) ; "Plants don't grow well on cobblestones."
			)
			(10 ; Jump
				(gMessager say: 0 159 0) ; "You're trying to get a reputation as a serious Hero here. Doing cartwheels in the streets won't help."
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)

	(method (newRoom newRoomNumber)
		(if (OneOf newRoomNumber 360 350)
			(gLongSong fade: 0)
		)
		(super newRoom: newRoomNumber &rest)
	)
)

(instance sEnter of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: PolyPath local0 local1 self)
			)
			(1
				(cond
					((and (== local2 5) (gCast contains: igor))
						(SetFlag 76)
						(gMessager say: 17 6 18 0 self) ; "Igor very glad not to still be in grave. You Igor's friend now."
					)
					(
						(and
							(gCast contains: igor)
							(not (IsFlag 77))
							(not gNight)
						)
						(SetFlag 77)
						(= local6 1)
						(gMessager say: 18 6 16 0 self) ; "As you enter the northern part of town, you hear the sound of a chisel chipping away at a stone block. A man is carving gravestones at one end of the street."
					)
					((and (not (IsFlag 78)) gNight)
						(SetFlag 78)
						(= local6 1)
						(gMessager say: 18 6 17 0 self) ; "The stone carvings on the dark building seem to writhe in the moonlight. You get the feeling that they are hungry and waiting for something... or someone."
					)
					(else
						(= cycles 1)
					)
				)
			)
			(2
				(if (and local6 (== gHeroType 3)) ; Paladin
					(= local6 0)
					(gMessager say: 18 6 83 0 self) ; "A sense of great danger and hunger comes from near the door of the massive stone building."
				else
					(= cycles 1)
				)
			)
			(3
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sExitMonks of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(= local5 gEgoGait)
				(gEgo changeGait: 0 setMotion: MoveTo 187 183 self) ; walking
			)
			(1
				(gEgo setMotion: MoveTo 211 175 self)
			)
			(2
				(gEgo setHeading: 180 self)
			)
			(3
				(gMessager say: 18 6 82 0 self) ; "You retrieve the Dark One Sign from the monastery door, then quickly step away before the hectapus can react."
			)
			(4
				(gEgo get: 25) ; theDarksign
				(monkDoor setCycle: Beg self)
			)
			(5
				(gLongSong2 number: 961 loop: 1 play:)
				(gEgo
					setPri: -1
					changeGait: local5
					setMotion: MoveTo 210 180 self
				)
			)
			(6
				(if
					(and
						(IsFlag 41)
						(== gPrevRoomNum 360)
						(gCast contains: igor)
					)
					(gMessager say: 17 6 9 0 self) ; "If Igor get big Hero job, can he be pyromaniac too?"
				else
					(= cycles 1)
				)
			)
			(7
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sInMonks of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(= local5 gEgoGait)
				(gEgo changeGait: 0 setMotion: MoveTo 211 175 self) ; walking
			)
			(1
				(gEgo setPri: 51 setMotion: MoveTo 187 183 self)
			)
			(2
				(gEgo setMotion: MoveTo 203 187 self)
			)
			(3
				(gEgo changeGait: local5 setHeading: 0 self)
			)
			(4
				(gEgo drop: 25) ; theDarksign
				(gMessager say: 6 43 0 0 self) ; "You push the Dark One Sign into the indentation on the door. It fits perfectly!"
			)
			(5
				(gLongSong2 number: 960 loop: 1 play:)
				(monkDoor setCycle: End self)
			)
			(6
				(gCurRoom newRoom: 360)
			)
		)
	)
)

(instance sIgorWarn of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gEgo setHeading: 0)
				(igor loop: 1 cel: 1 setScript: 0)
				(= seconds 2)
			)
			(1
				(igor loop: 2 setCycle: End self)
			)
			(2
				(igor loop: 3 setCycle: Fwd)
				(= seconds 2)
			)
			(3
				(= local3 1)
				(Face gEgo (igor x:) (igor y:) self)
			)
			(4
				(gMessager say: 17 6 7 0 self) ; "Bad place. Very Bad Place. Go away. You be very sorry."
			)
			(5
				(igor cycleSpeed: 10)
				(= seconds 1)
			)
			(6
				(igor setCycle: End self)
			)
			(7
				(igor loop: 2 cel: 5)
				(= seconds 2)
			)
			(8
				(igor setCycle: Beg self)
			)
			(9
				(igor setScript: sIgorCarve)
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sIgorCarve of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(igor loop: 1 cel: 1)
				(= seconds 4)
			)
			(1
				(igor loop: 0 setCycle: Fwd)
				(= seconds (Random 3 15))
			)
			(2
				(igor setCycle: 0 loop: 1 cel: 1)
				(= seconds (Random 1 4))
			)
			(3
				(= state 0)
				(= cycles 1)
			)
		)
	)
)

(instance sInGuildDoor of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(SetFlag 108)
				(= cycles 1)
			)
			(1
				(= cycles 1)
			)
			(2
				(gLongSong2 number: 960 loop: 1 play:)
				(guildDoor setCycle: End self)
			)
			(3
				(gEgo setPri: 17 setMotion: MoveTo 35 128 self)
			)
			(4
				(guildDoor setCycle: Beg self)
			)
			(5
				(gLongSong2 number: 961 loop: 1 play:)
				(= seconds 2)
			)
			(6
				(gEgo setPri: -1)
				(gGlory handsOn:)
				(gCurRoom newRoom: 350)
			)
		)
	)
)

(instance sOutGuildDoor of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(gEgo loop: 0 posn: 35 128 setPri: 17)
				(= cycles 1)
			)
			(1
				(gLongSong2 number: 960 loop: 1 play:)
				(guildDoor setCycle: End self)
			)
			(2
				(gEgo setMotion: MoveTo 81 138 self)
			)
			(3
				(gEgo setPri: -1)
				(guildDoor setCycle: Beg self)
			)
			(4
				(gLongSong2 number: 961 loop: 1 play:)
				(= seconds 2)
			)
			(5
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sHectapusDeath of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(= local5 gEgoGait)
				(gEgo changeGait: 0 setMotion: MoveTo 211 175 self) ; walking
			)
			(1
				(gEgo setPri: 55 setMotion: MoveTo 187 183 self)
				(hectIncidental
					setPri: 221
					loop: 0
					cel: 0
					init:
					setCycle: End self
				)
			)
			(2 0)
			(3
				(gEgo setLoop: 3 1)
				(hectIncidental loop: 1 posn: 180 96 setCycle: Fwd)
				(= seconds 1)
			)
			(4
				(if (and (gCast contains: igor) (< (igor loop:) 2))
					(sIgorCarve dispose:)
					(igor setLoop: 2 1 setCycle: End self)
				else
					(= cycles 1)
				)
			)
			(5
				(hectMidLtArm setCycle: Fwd)
				(hectMidRtArm setCycle: Fwd)
				(hectLtArm setCycle: End)
				(hectRtArm setCycle: End self)
			)
			(6
				(if (gCast contains: igor)
					(gMessager say: 17 6 8 0 self) ; "Nobody ever listen to Igor."
				else
					(= cycles 1)
				)
			)
			(7
				(EgoDead 33 250 978 1 912) ; "That hectapus has had the munchies ever since it got "stoned." Fortunately for it (but not for you), it occasionally gets its meals delivered right to the door."
			)
		)
	)
)

(instance sClimbIntoMonks of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(SetFlag 328)
				(gMessager say: 18 6 13 0 self) ; "You find a good spot, then climb up the monastery wall."
			)
			(1
				(= local4 (gEgo cycleSpeed:))
				(gEgo
					view: 7
					setLoop: 3 1
					cel: 0
					posn: 135 150
					setSpeed: 15
					setCycle: Walk
					setScaler: Scaler 89 60 150 120
					setMotion: MoveTo 135 120 self
				)
			)
			(2
				(gEgo cycleSpeed: local4)
				(gGlory handsOn:)
				(gCurRoom newRoom: 360)
			)
		)
	)
)

(instance sClimbOutMonks of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(ClearFlag 328)
				(= cycles 2)
			)
			(1
				(= local4 (gEgo cycleSpeed:))
				(gEgo
					setSpeed: 15
					setCycle: Walk
					setMotion: MoveTo 135 150 self
				)
			)
			(2
				(gEgo
					setSpeed: local4
					normalize: 3
					setMotion: MoveTo 135 155 self
				)
			)
			(3
				(if
					(and
						(IsFlag 41)
						(== gPrevRoomNum 360)
						(gCast contains: igor)
					)
					(gMessager say: 17 6 9 0 self) ; "If Igor get big Hero job, can he be pyromaniac too?"
				else
					(= cycles 1)
				)
			)
			(4
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance sGrapnelIntoMonks of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(SetFlag 328)
				(gEgo
					view: 8
					loop: 0
					cel: 0
					x: 107
					y: 149
					setCycle: End self
				)
			)
			(1
				(gMessager say: 9 33 0 0 self) ; "You climb up to the window and slip through."
			)
			(2
				(gGlory handsOn:)
				(gCurRoom newRoom: 360)
			)
		)
	)
)

(instance sLevitateInMonks of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(SetFlag 330)
				(= cycles 1)
			)
			(1
				(gGlory handsOn:)
				(gCurRoom newRoom: 360)
			)
		)
	)
)

(instance heroTeller of Teller
	(properties)

	(method (showCases)
		(super showCases: 49 (not (IsFlag 267)))
	)

	(method (respond)
		(super respond: &rest)
		(if (or (not iconValue) (== iconValue -999))
			(switch local2
				(1
					(SetFlag 74)
				)
				(2
					(SetFlag 75)
				)
			)
			(= global415 gDay)
		)
		(return 1)
	)

	(method (sayMessage)
		(if (== iconValue 49)
			(SetFlag 267)
		)
		(super sayMessage: &rest)
	)
)

(instance sLevitateOutMonks of Script
	(properties)

	(method (changeState newState)
		(switch (= state newState)
			(0
				(gGlory handsOff:)
				(ClearFlag 330)
				(= local4 (gEgo cycleSpeed:))
				(sparklies init: setCycle: Fwd)
				(gEgo
					view: 17
					setLoop: 1 1
					setCel: 6
					setSpeed: 6
					setPri: 150
					setCycle: 0
					useMana: 7
				)
				(= cycles 1)
			)
			(1
				(gEgo setMotion: MoveTo 135 150 self)
			)
			(2
				(sparklies dispose:)
				(gEgo view: 17 loop: 1 cel: 6 setPri: 150 setCycle: Beg self)
			)
			(3
				(gEgo
					setSpeed: local4
					useMana: 7
					normalize: 3
					setMotion: MoveTo 135 155 self
				)
			)
			(4
				(if
					(and
						(IsFlag 41)
						(== gPrevRoomNum 360)
						(gCast contains: igor)
					)
					(gMessager say: 17 6 9 0 self) ; "If Igor get big Hero job, can he be pyromaniac too?"
				else
					(= cycles 1)
				)
			)
			(5
				(gGlory handsOn:)
				(self dispose:)
			)
		)
	)
)

(instance igorTeller of Teller
	(properties
		title 1
	)

	(method (init)
		(super init: &rest)
		(= talker (ScriptID 73 0)) ; igorTalker
	)

	(method (showCases)
		(super
			showCases:
				2 ; Name
				(not (IsFlag 267))
				32
				global431
				5 ; Crypt Key
				(if (OneOf local2 2 3)
					(IsFlag 205)
				else
					0
				)
				3 ; Crypt Key
				(if (>= local2 5)
					(not (IsFlag 268))
				else
					0
				)
		)
	)

	(method (respond)
		(super respond: &rest)
		(if (or (not iconValue) (== iconValue -999))
			(switch local2
				(1
					(SetFlag 74)
				)
				(2
					(SetFlag 75)
				)
			)
			(= global415 gDay)
		)
		(return 1)
	)

	(method (sayMessage)
		(switch iconValue
			(2 ; Name
				(SetFlag 267)
			)
			(3 ; Crypt Key
				(gEgo get: 60) ; crypt-key
				(SetFlag 268)
			)
		)
		(super sayMessage: &rest)
	)
)

(instance guildDoorTeller of Teller
	(properties
		actionVerb 4
	)

	(method (showCases)
		(super
			showCases:
				29 ; Pick the Lock
				(if (not (IsFlag 108))
					(gEgo has: 24) ; theToolkit
				else
					0
				)
				28 ; Unlock Door
				(if (and (not (IsFlag 108)) (gEgo has: 14)) ; theKeyRing
					(gEgo has: 61) ; guild-key
				else
					0
				)
				27 ; Break Door Open
				(not (IsFlag 108))
		)
	)

	(method (sayMessage)
		(switch iconValue
			(26 ; Open Door
				(if (IsFlag 108)
					(self clean:)
					(gCurRoom setScript: sInGuildDoor)
				else
					(super sayMessage: &rest) ; The door is locked.
				)
			)
			(27 ; Break Door Open
				(if (== (gEgo trySkill: 0 275) 1) ; strength
					(self clean:)
					(gEgo addHonor: -20)
					(SetFlag 108)
					(SetFlag 322)
					(gMessager say: 18 6 79) ; "You force the guild door open. It breaks right off its hinges."
					(gCurRoom setScript: sInGuildDoor)
				else
					(super sayMessage: &rest) ; You're not strong enough to force the door.
				)
			)
			(29 ; Pick the Lock
				(if gNight
					(if (== (gEgo trySkill: 9 250) 1) ; pick locks
						(self clean:)
						(gEgo addHonor: -20)
						(SetFlag 108)
						(gMessager say: 18 6 37) ; "After a bit of fiddling, then a little drumming, the lock opens with a musical "snick." You ain't whistlin' "Dixie"!"
						(gCurRoom setScript: sInGuildDoor)
					else
						(gMessager say: 18 6 10) ; "This seems to be a fairly difficult lock. You'll need more practice before you can pick it."
					)
				else
					(gMessager say: 18 6 35) ; "Somebody might see you if you try this during the day!"
				)
			)
			(28 ; Unlock Door
				(self clean:)
				(gEgo addHonor: 50)
				(SetFlag 108)
				(gMessager say: 16 144 28) ; "The key you got from the Burgomeister easily unlocks the door."
				(gCurRoom setScript: sInGuildDoor)
			)
			(else
				(super sayMessage: &rest)
			)
		)
	)
)

(instance monkDoorTeller of Teller
	(properties
		actionVerb 4
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(cond
					((and (IsFlag 41) (== gPrevRoomNum 360))
						(gMessager say: 18 6 81) ; "The intense flames within the monastery have grown with an unnatural swiftness and turned into a raging inferno! There's no way you could go back in there and survive."
					)
					((and (not local3) (<= gTime 3) (not (== local2 4)))
						(gCurRoom setScript: sIgorWarn)
					)
					(else
						(super doVerb: theVerb &rest)
					)
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)

	(method (sayMessage)
		(switch iconValue
			(26 ; Open Monastery Door
				(self clean:)
				(gMessager say: 16 145 26) ; "You start to open the monastery door."
				(gCurRoom setScript: sHectapusDeath)
			)
			(27 ; Force Door Open
				(self clean:)
				(gMessager say: 16 145 27) ; "You run full force into the door to try to break it open."
				(gCurRoom setScript: sHectapusDeath)
			)
			(29 ; Pick Lock
				(self clean:)
				(if gNight
					(gMessager say: 16 145 29) ; "You skillfully pick the lock and open the door. Actually, you're surprised by how easy it was to pick this lock."
					(gCurRoom setScript: sHectapusDeath)
				else
					(gMessager say: 18 6 35) ; "Somebody might see you if you try this during the day!"
				)
			)
			(else
				(super sayMessage: &rest)
			)
		)
	)

	(method (showCases)
		(super
			showCases:
				29 ; Pick Lock
				(if (or (gEgo has: 13) (gEgo has: 24)) ; theLockpick, theToolkit
				else
					0
				)
		)
	)
)

(instance igor of Actor
	(properties
		noun 17
		approachX 44
		approachY 160
		x 21
		y 152
		priority 70
		fixPriority 1
		view 257
		signal 16385
	)

	(method (doit)
		(if (< (Abs (- gGameTime local8)) 2)
			(return)
		)
		(= local8 gGameTime)
		(if
			(and
				(self cycler:)
				((self cycler:) isKindOf: Fwd)
				(== (self view:) 257)
				(== (self loop:) 0)
				(== (self cel:) 2)
				(not (& (self signal:) $0008))
			)
			(gLongSong3 number: 13 play:)
		)
		(super doit: &rest)
	)

	(method (init)
		(super init: &rest)
		(igorTeller
			init:
				self
				250
				16
				123
				(switch local2
					(0 19)
					(1 12)
					(2 11)
					(3 14)
					(5 15)
					(6 13)
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

(instance monkDoor of Prop
	(properties
		noun 6
		approachX 210
		approachY 175
		x 229
		y 174
		fixPriority 1
		view 250
		signal 16385
	)

	(method (init)
		(super init: &rest)
		(monkDoorTeller init: self 250 16 145)
	)

	(method (doVerb theVerb)
		(cond
			((OneOf theVerb 28 42 29 43) ; theLockpick, theToolkit, theKeyRing, theDarksign
				(cond
					((and (IsFlag 41) (== gPrevRoomNum 360))
						(gMessager say: 18 6 81) ; "The intense flames within the monastery have grown with an unnatural swiftness and turned into a raging inferno! There's no way you could go back in there and survive."
					)
					((and (not local3) (<= gTime 3) (not (== local2 4)))
						(gCurRoom setScript: sIgorWarn)
					)
					(else
						(switch theVerb
							(28 ; theLockpick
								(if gNight
									(gMessager say: 16 145 29) ; "You skillfully pick the lock and open the door. Actually, you're surprised by how easy it was to pick this lock."
									(gCurRoom setScript: sHectapusDeath)
								else
									(gMessager say: 18 6 35) ; "Somebody might see you if you try this during the day!"
								)
							)
							(42 ; theToolkit
								(if gNight
									(gMessager say: 16 145 29) ; "You skillfully pick the lock and open the door. Actually, you're surprised by how easy it was to pick this lock."
									(gCurRoom setScript: sHectapusDeath)
								else
									(gMessager say: 18 6 35) ; "Somebody might see you if you try this during the day!"
								)
							)
							(29 ; theKeyRing
								(gMessager say: 18 6 38) ; "You don't have a key that will open this door."
							)
							(else
								(gCurRoom setScript: sInMonks)
							)
						)
					)
				)
			)
			((== theVerb 80) ; openSpell
				(if gNight
					(gMessager say: 18 6 12) ; "You feel your spell being deflected towards the hectapus relief and its energy dissipating."
				else
					(gMessager say: 18 6 34) ; "Somebody might see you if you try this during the day!"
				)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance guildDoor of Prop
	(properties
		noun 1
		sightAngle 90
		approachX 65
		approachY 135
		x 63
		y 108
		view 250
		loop 3
		signal 16385
	)

	(method (init)
		(super init: &rest)
		(if (IsFlag 108)
			(= heading
				(((ScriptID 49 0) new:) ; doorMat
					init:
						((Polygon new:)
							type: PNearestAccess
							init: 68 128 78 137 53 141 43 130
							yourself:
						)
						1
						7
						3
						sInGuildDoor
					yourself:
				)
			)
		else
			(guildDoorTeller init: self 250 16 144)
		)
	)

	(method (handleEvent event)
		(switch (event message:)
			(KEY_P
				(= approachX 120)
				(= approachY 149)
			)
			(JOY_DOWNRIGHT
				(= approachX 65)
				(= approachY 135)
			)
			(else
				(= approachX 79)
				(= approachY 138)
			)
		)
		(super handleEvent: event &rest)
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(cond
					((IsFlag 322)
						(gMessager say: 1 4 30) ; "Haven't you done enough damage to the poor door? You walk on through."
					)
					((IsFlag 108)
						(gMessager say: 18 6 80) ; "You walk right on in."
					)
					(else 0)
				)
			)
			(42 ; theToolkit
				(if gNight
					(if (== (gEgo trySkill: 9 250) 1) ; pick locks
						(gEgo addHonor: -20)
						(SetFlag 108)
						(gMessager say: 18 6 37) ; "After a bit of fiddling, then a little drumming, the lock opens with a musical "snick." You ain't whistlin' "Dixie"!"
						(gCurRoom setScript: sInGuildDoor)
					else
						(gMessager say: 18 6 10) ; "This seems to be a fairly difficult lock. You'll need more practice before you can pick it."
					)
				else
					(gMessager say: 18 6 35) ; "Somebody might see you if you try this during the day!"
				)
			)
			(28 ; theLockpick
				(if gNight
					(if (== (gEgo trySkill: 9 250) 1) ; pick locks
						(gEgo addHonor: -20)
						(SetFlag 108)
						(gMessager say: 16 144 29) ; "You pick the lock of the boarded-up door."
						(gCurRoom setScript: sInGuildDoor)
					else
						(gMessager say: 18 6 10) ; "This seems to be a fairly difficult lock. You'll need more practice before you can pick it."
					)
				else
					(gMessager say: 18 6 35) ; "Somebody might see you if you try this during the day!"
				)
			)
			(29 ; theKeyRing
				(if (gEgo has: 61) ; guild-key
					(if (not (IsFlag 108))
						(gEgo addHonor: 50)
					)
					(gMessager say: 18 6 36) ; "You unlock the door using the key the Burgomeister gave you."
					(gCurRoom setScript: sInGuildDoor)
				else
					(gMessager say: 18 6 38) ; "You don't have a key that will open this door."
				)
			)
			(80 ; openSpell
				(if gNight
					(gEgo castSpell: 20)
					(gEgo addHonor: -20)
					(= global441 50)
					(= global442 110)
					(gCurRoom setScript: (ScriptID 13 0) 0 self) ; castOpenScript
				else
					(gMessager say: 18 6 35) ; "Somebody might see you if you try this during the day!"
				)
			)
			(-80 ; openSpell (part 2)
				(gMessager say: 1 80 0) ; "Your spell easily opens the old door."
				(gCurRoom setScript: sInGuildDoor)
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)

	(method (dispose)
		(if heading
			(heading dispose:)
		)
		(super dispose: &rest)
	)
)

(instance fire1 of Prop
	(properties
		x 140
		y 105
		view 250
		loop 1
	)
)

(instance fire2 of Prop
	(properties
		x 181
		y 69
		view 250
		loop 4
	)
)

(instance hectIncidental of Prop
	(properties
		noun 7
		approachX 210
		approachY 175
		x 178
		y 78
		priority 221
		view 251
	)
)

(instance hectLtArm of Prop
	(properties
		noun 7
		approachX 210
		approachY 175
		x 184
		y 106
		priority 119
		view 251
		loop 2
	)
)

(instance hectRtArm of Prop
	(properties
		noun 7
		approachX 210
		approachY 175
		x 184
		y 106
		priority 119
		view 251
		loop 4
	)
)

(instance hectMidLtArm of Prop
	(properties
		noun 7
		approachX 210
		approachY 175
		x 184
		y 106
		priority 11
		view 251
		loop 6
	)
)

(instance hectMidRtArm of Prop
	(properties
		noun 7
		approachX 210
		approachY 175
		x 184
		y 106
		priority 11
		view 251
		loop 8
	)
)

(instance shovel of View
	(properties
		noun 20
		sightAngle 180
		x 69
		y 152
		z 50
		fixPriority 1
		view 250
		loop 5
		signal 16384
	)
)

(instance stone of View
	(properties
		noun 21
		sightAngle 180
		approachX 43
		approachY 146
		x 27
		y 175
		z 30
		fixPriority 1
		view 257
		loop 4
		signal 16384
	)
)

(instance burntRemains of View
	(properties
		noun 23
		sightAngle 180
		approachX 189
		approachY 175
		x 52
		y 60
		view 252
		signal 16384
	)
)

(instance burntRemains1 of View
	(properties
		noun 23
		sightAngle 180
		approachX 189
		approachY 175
		x 113
		y 25
		view 252
		cel 1
		signal 16384
	)
)

(instance burntRemains2 of View
	(properties
		noun 23
		sightAngle 180
		approachX 189
		approachY 175
		x 151
		y 116
		view 252
		cel 2
		signal 16384
	)
)

(instance burntRemains3 of View
	(properties
		noun 23
		sightAngle 180
		approachX 189
		approachY 175
		x 141
		y 175
		view 252
		cel 3
		signal 16384
	)
)

(instance unknown_250_35 of Feature
	(properties
		noun 23
		nsLeft 106
		nsTop 23
		nsRight 319
		nsBottom 163
		sightAngle 180
		approachX 189
		approachY 175
		x 169
		y 95
	)
)

(instance unknown_250_36 of Feature
	(properties
		noun 2
		nsLeft 2
		nsTop 71
		nsRight 38
		nsBottom 119
		sightAngle 180
		x 20
		y 95
	)
)

(instance unknown_250_37 of Feature
	(properties
		noun 3
		nsLeft 31
		nsTop 1
		nsRight 87
		nsBottom 67
		sightAngle 180
		x 59
		y 34
	)
)

(instance unknown_250_38 of Feature
	(properties
		nsLeft 69
		nsTop 95
		nsRight 117
		nsBottom 138
		sightAngle 180
		x 93
		y 116
	)
)

(instance unknown_250_39 of Feature
	(properties
		noun 4
		nsLeft 54
		nsTop 137
		nsRight 151
		nsBottom 189
		sightAngle 180
		x 102
		y 163
	)
)

(instance unknown_250_40 of Feature
	(properties
		noun 5
		nsLeft 131
		nsTop 82
		nsRight 150
		nsBottom 102
		sightAngle 180
		approachX 135
		approachY 150
		x 140
		y 92
	)

	(method (doVerb theVerb)
		(switch theVerb
			(4 ; Do
				(if gNight
					(if (== (gEgo trySkill: 11 250) 1) ; climbing
						(gCurRoom setScript: sClimbIntoMonks)
					else
						(gMessager say: 18 6 14) ; "The wall is too smooth to climb with your level of skill."
					)
				else
					(gMessager say: 18 6 34) ; "Somebody might see you if you try this during the day!"
				)
			)
			(33 ; theGrapnel
				(if gNight
					(if (== (gEgo trySkill: 11 200) 1) ; climbing
						(gCurRoom setScript: sGrapnelIntoMonks)
					else
						(gMessager say: 18 6 14) ; "The wall is too smooth to climb with your level of skill."
					)
				else
					(gMessager say: 18 6 34) ; "Somebody might see you if you try this during the day!"
				)
			)
			(10 ; Jump
				(gMessager say: 9 159 0) ; "Try climbing it instead."
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance unknown_250_41 of Feature
	(properties
		noun 5
		nsLeft 230
		nsTop 52
		nsRight 252
		nsBottom 76
		sightAngle 180
		approachX 135
		approachY 150
		x 241
		y 64
	)

	(method (doVerb theVerb)
		(unknown_250_40 doVerb: theVerb &rest)
	)
)

(instance unknown_250_42 of Feature
	(properties
		noun 7
		nsLeft 149
		nsTop 74
		nsRight 223
		nsBottom 111
		sightAngle 180
		approachX 210
		approachY 175
		x 186
		y 92
	)
)

(instance unknown_250_43 of Feature
	(properties
		noun 8
		nsLeft 236
		nsTop 67
		nsRight 319
		nsBottom 186
		sightAngle 180
		x 277
		y 126
	)
)

(instance unknown_250_44 of Feature
	(properties
		noun 9
		nsLeft 94
		nsTop 50
		nsRight 172
		nsBottom 101
		sightAngle 180
		approachX 135
		approachY 150
		x 133
		y 75
	)

	(method (handleEvent event)
		(if (== (event message:) $0021) ; !
			(= approachX 107)
			(= approachY 149)
		else
			(= approachX 135)
			(= approachY 150)
		)
		(super handleEvent: event &rest)
	)

	(method (doVerb theVerb)
		(switch theVerb
			(33 ; theGrapnel
				(gMessager say: 9 4 0) ; "You attempt to scale the wall."
			)
			(else
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance unknown_250_45 of Feature
	(properties
		noun 9
		nsLeft 208
		nsTop 21
		nsRight 310
		nsBottom 69
		sightAngle 180
		approachX 135
		approachY 150
		x 259
		y 45
	)

	(method (doVerb theVerb)
		(unknown_250_44 doVerb: theVerb &rest)
	)
)

(instance unknown_250_46 of Feature
	(properties
		noun 10
		nsLeft 128
		nsTop 24
		nsRight 143
		nsBottom 35
		sightAngle 180
		approachX 135
		approachY 150
		x 135
		y 29
	)
)

