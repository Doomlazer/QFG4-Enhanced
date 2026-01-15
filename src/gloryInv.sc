;;; Sierra Script 1.0 - (do not remove this comment)
;;; Decompiled by sluicebox
(script# 16)
(include sci.sh)
(use Main)
(use GloryIconItem)
(use Str)
(use Print)
(use Cursor)
(use Actor)
(use System)

(public
	gloryInv 0
)

(local
	local0
	local1
	local2
	local3
)

(procedure (localproc_0 &tmp temp0)
	(gTheIconBar curInvIcon: 0 advanceCurIcon:)
	(gTheIconBar disableIcon: (gTheIconBar at: 6))
	(= temp0 (ScriptID 36 1)) ; invItem
	(temp0 signal: (| (temp0 signal:) $0008))
	(DeleteScreenItem temp0)
)

(instance gloryInv of QGInv
	(properties
		planeTop 29
		planeLeft 65
		numRow 3
		numCol 6
		rowMargin 1
		itemWide 27
		itemHigh 24
		iconMargin 5
		invLeft 16
	)

	(method (drawInvItems &tmp temp0)
		(= temp0 0)
		(if (< (thePurse amount:) 1)
			(thePurse amount: 1)
			(= temp0 1)
		)
		(super drawInvItems:)
		(if temp0
			(thePurse amount: 0)
		)
	)

	(method (drawIcons)
		(super drawIcons: &rest)
		(plane addCast: (= local2 (Cast new:)))
		((View new:) view: 932 loop: 10 cel: 2 posn: 0 26 init: local2)
		((View new:) view: 932 loop: 10 cel: 0 posn: 3 28 init: local2)
		((View new:) view: 932 loop: 10 cel: 1 posn: 170 28 init: local2)
		(invSlider
			theSlider:
				((View new:)
					x: 180
					y: 41
					view: 932
					loop: 12
					cel: 0
					init: local2
					yourself:
				)
		)
	)

	(method (init)
		(= gInventory self)
		(self
			helpIconItem: invHelp
			selectIcon: invSelect
			theSlider: invSlider
			okButton: ok
		)
		(self
			add:
				thePurse
				theManas
				theCures
				theHeals
				theRations
				theThrowdagger
				theRocks
				theCandle
				theCandy
				theFlask
				theWater
				theGruegoo
				theBonemeal
				theLockpick
				theKeyRing
				theOil
				theGrapnel
				theArmor
				theShield
				theSword
				theDagger
				theFlint
				theGarlic
				theGuildcard
				theToolkit
				theDarksign
				theHat
				theCorn
				thePiepan
				theBones
				theBerries
				theHumorbar
				theRehydrator
				theDoll
				theBlackbird
				theCloth
				theChicken
				(ScriptID 35 17) ; theAmulet
				(ScriptID 35 18) ; theHair
				(ScriptID 35 19) ; theBroom
				(ScriptID 35 12) ; theFlowers
				(ScriptID 35 13) ; theWillowisp
				(ScriptID 35 14) ; theLocket
				(ScriptID 35 15) ; theStatue
				(ScriptID 35 16) ; theTorch
				(ScriptID 35 0) ; theJewelry
				(ScriptID 35 1) ; theKnob
				(ScriptID 35 2) ; theStaff
				(ScriptID 35 3) ; theBonsai
				(ScriptID 35 4) ; theHammer
				(ScriptID 35 5) ; theStake
				(ScriptID 35 6) ; theBag
				(ScriptID 35 7) ; theBoneRit
				(ScriptID 35 8) ; theBloodRit
				(ScriptID 35 9) ; theBreathRit
				(ScriptID 35 10) ; theSenseRit
				(ScriptID 35 11) ; theHeartRit
				invDummy1
				invLook
				invSelect
				invHelp
				ok
				invDummy2
				invSlider
				invUpArrow
				invDownArrow
			eachElementDo: #highlightColor -1
			eachElementDo: #lowlightColor -1
			eachElementDo: #modNum 16
			state: 2048
		)
		(super init:)
		(gEgo get: 0) ; thePurse
		(thePurse amount: 0)
	)

	(method (showSelf param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5)
		(= local3 (= owner param1))
		(= temp1 (CelWide 932 8 0))
		(= temp0 (CelHigh 932 8 0))
		(= temp2 (/ (- 320 temp1) 2))
		(= temp4 (/ (- 153 temp0) 2))
		(= temp3 (+ temp2 temp1))
		(= temp5 (+ temp4 temp0))
		(plane back: 108)
		(gThePlane addCast: (= local1 (Cast new:)))
		((View new:)
			view: 932
			loop: 8
			cel: 0
			setPri: 254
			posn: temp2 temp4
			init: local1
		)
		((View new:)
			view: 932
			loop: 9
			cel: 0
			setPri: 254
			posn: 53 143
			init: local1
		)
		(self getInvNum:)
		(= currentRow (= curIndex 0))
		((invSlider theSlider:) y: 41)
		(UpdateScreenItem (invSlider theSlider:))
		(super showSelf: param1)
	)

	(method (hide)
		(gThePlane deleteCast: local1)
		(super hide: &rest)
		(local1 dispose:)
	)
)

(instance invSlider of SliderIcon
	(properties
		noun 53
		nsLeft 180
		nsTop 39
		nsRight 191
		nsBottom 98
		x 180
		y 39
		signal 131
		message 4
		mainView 932
		mainLoop 15
		helpVerb 9
	)

	(method (select &tmp temp0 temp1 [temp2 4] temp6)
		(while
			(not
				(OneOf
					((= temp0 ((gUser curEvent:) new:)) type:)
					2
					8
					64
				)
			)
			(temp0 localize: (gloryInv plane:))
			(cond
				((< (temp0 y:) 41)
					(theSlider y: 41)
				)
				((> (temp0 y:) 92)
					(theSlider y: 92)
				)
				(else
					(theSlider y: (temp0 y:))
				)
			)
			(UpdateScreenItem theSlider)
			(FrameOut)
		)
		(temp0 localize: (gloryInv plane:))
		(cond
			(
				(or
					(not
						(= temp1
							(/ (+ (- (temp0 y:) 41) 8) (gloryInv interval:))
						)
					)
					(< (temp0 y:) 41)
				)
				(self updateSlider: 0 0)
				(while (> (gloryInv currentRow:) 0)
					(gloryInv currentRow: (- (gloryInv currentRow:) 1))
					(gloryInv setCurIndex: -6)
				)
			)
			((or (== temp1 (gloryInv totalRow:)) (> (temp0 y:) 92))
				(self updateSlider: 0 1)
				(while (< (gloryInv currentRow:) (gloryInv totalRow:))
					(gloryInv currentRow: (+ (gloryInv currentRow:) 1))
					(gloryInv setCurIndex: 6)
				)
			)
			(else
				(theSlider y: (+ 41 (* temp1 (gloryInv interval:))))
				(UpdateScreenItem theSlider)
				(cond
					((> (= temp6 (- temp1 (gloryInv currentRow:))) 0)
						(while temp6
							(gloryInv currentRow: (+ (gloryInv currentRow:) 1))
							(gloryInv setCurIndex: 6)
							(-- temp6)
						)
					)
					((< temp6 0)
						(while temp6
							(gloryInv currentRow: (- (gloryInv currentRow:) 1))
							(gloryInv setCurIndex: -6)
							(++ temp6)
						)
					)
				)
			)
		)
		(gloryInv drawInvItems:)
		(return 0)
	)

	(method (updateSlider param1 param2 &tmp temp0)
		(if (> argc 1)
			(if param2
				(theSlider y: 92)
			else
				(theSlider y: 41)
			)
		else
			(theSlider y: (+ (theSlider y:) param1))
		)
		(UpdateScreenItem theSlider)
	)
)

(instance invUpArrow of GloryIconItem
	(properties
		noun 2
		nsLeft 180
		nsTop 30
		nsRight 191
		nsBottom 38
		x 180
		y 30
		signal 131
		message 4
		mainView 932
		mainLoop 14
		helpVerb 9
	)

	(method (select)
		(if (>= (- (gloryInv currentRow:) 1) 0)
			(gloryInv currentRow: (- (gloryInv currentRow:) 1))
			(if (== (gloryInv currentRow:) 0)
				(invSlider updateSlider: 0 0)
			else
				(invSlider updateSlider: (- 0 (gloryInv interval:)))
			)
			(gloryInv setCurIndex: -6 drawInvItems:)
		)
		(return 0)
	)
)

(instance invDownArrow of GloryIconItem
	(properties
		noun 1
		nsLeft 180
		nsTop 100
		nsRight 191
		nsBottom 108
		x 180
		y 100
		signal 131
		message 4
		mainView 932
		mainLoop 13
		helpVerb 9
	)

	(method (select)
		(if (<= (+ (gloryInv currentRow:) 1) (gloryInv totalRow:))
			(gloryInv currentRow: (+ (gloryInv currentRow:) 1))
			(if (== (gloryInv currentRow:) (gloryInv totalRow:))
				(invSlider updateSlider: 0 1)
			else
				(invSlider updateSlider: (gloryInv interval:))
			)
			(gloryInv setCurIndex: 6 drawInvItems:)
		)
		(return 0)
	)
)

(instance invDummy1 of GloryIconItem
	(properties
		signal 131
		mainView 932
		mainLoop 7
	)

	(method (onMe)
		(return 0)
	)

	(method (highlight))

	(method (select))
)

(instance invDummy2 of GloryIconItem
	(properties
		signal 67
		mainView 932
		mainLoop 7
		mainCel 1
	)

	(method (onMe)
		(return 0)
	)

	(method (highlight))

	(method (select))
)

(instance invLook of GloryIconItem
	(properties
		noun 3
		modNum 16
		message 1
		mainView 932
		mainLoop 2
		cursorView 941
		cursorLoop 0
		cursorCel 0
		helpVerb 9
	)
)

(instance invSelect of GloryIconItem
	(properties
		noun 4
		modNum 16
		mainView 932
		cursorView 942
		cursorLoop 0
		cursorCel 0
		helpVerb 9
	)
)

(instance invHelp of GloryIconItem
	(properties
		noun 6
		modNum 16
		signal 3
		message 9
		mainView 932
		mainLoop 1
		cursorView 949
		cursorLoop 0
		cursorCel 0
		helpVerb 9
	)
)

(instance ok of GloryIconItem
	(properties
		noun 7
		modNum 16
		signal 3
		mainView 932
		mainLoop 3
		helpVerb 9
	)
)

(instance thePurse of NumInvItem
	(properties
		noun 8
		message 15
		mainView 905
		mainCel 5
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1 temp2 temp3)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(= temp2 (Str new:))
		(= temp3 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (or amount global395)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 8 1 0 2) ; "This pouch holds all your money."
					)
					(Print y: 165 addText: 0 theVerb 34 1 0 0 16 init:) ; "This simple money pouch contains all the money you have with you."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 8 1 0 2) ; "This pouch holds all your money."
					)
				)
				(if amount
					(Message msgGET 16 0 0 33 1 (temp1 data:)) ; "crowns: %d"
					(temp0 format: (temp1 data:) amount)
					(Print addText: (temp0 data:) 0 0)
				)
				(if global395
					(Message msgGET 16 0 0 13 1 (temp2 data:)) ; "kopeks: %d"
					(temp0 format: (temp2 data:) global395)
					(Print addText: (temp0 data:) 0 (if amount 9 else 0))
				)
				(if (or amount global395)
					(Message msgGET 16 0 0 17 1 (temp3 data:)) ; "total Weight: %d"
					(temp0 format: (temp3 data:) (+ amount global395))
					(Print
						addText:
							(temp0 data:)
							0
							(if (and amount global395) 18 else 9)
					)
				else
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 0 15 12 1) ; "You have no money!"
					)
					(Print addText: 0 15 12 1 0 0 16) ; "You have no money!"
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 0 15 12 1) ; "You have no money!"
					)
				)
				(Print y: 165 init:)
			)
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 8 37 0 1) ; "You need a hole in your money pouch like you need a hole in the head. (Of course, you probably already have one of the latter to even be trying this!)"
				)
				(Print y: 165 addText: 8 37 0 1 0 0 16 init:) ; "You need a hole in your money pouch like you need a hole in the head. (Of course, you probably already have one of the latter to even be trying this!)"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 8 37 0 1) ; "You need a hole in your money pouch like you need a hole in the head. (Of course, you probably already have one of the latter to even be trying this!)"
				)
			)
			(101 ; ???
				(Print y: 165 addText: 0 101 16 1 0 0 16 init:) ; "You need your money pouch."
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
		(temp2 dispose:)
		(temp3 dispose:)
	)
)

(instance theManas of NumInvItem
	(properties
		noun 63
		message 16
		mainView 905
		mainLoop 6
		mainCel 9
		value 5
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 63 1 0 1 (temp0 data:)) ; "Mana Fruit"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 63 1 0 2) ; "This unusual-looking fruit came from the tree in Erana's Garden. You sense a tingling sensation from the magical energy stored in it."
					)
					(Print y: 165 addText: 63 1 0 2 0 0 16 init:) ; "This unusual-looking fruit came from the tree in Erana's Garden. You sense a tingling sensation from the magical energy stored in it."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 63 1 0 2) ; "This unusual-looking fruit came from the tree in Erana's Garden. You sense a tingling sensation from the magical energy stored in it."
					)
				else
					(Message msgGET 16 63 1 0 1 (temp0 data:)) ; "Mana Fruit"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 63 76 0 1) ; "You've never cared for cooked fruit."
				)
				(Print y: 165 addText: 63 76 0 1 0 0 16 init:) ; "You've never cared for cooked fruit."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 63 76 0 1) ; "You've never cared for cooked fruit."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theCures of NumInvItem
	(properties
		noun 59
		message 17
		mainView 905
		mainLoop 2
		mainCel 8
		value 5
	)

	(method (doVerb theVerb)
		(switch theVerb
			(18 ; theHeals
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
				(Print y: 165 addText: 59 18 0 1 0 0 16 init:) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
			)
			(25 ; theWater
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 62 25 0 1) ; "The potion probably won't work as well if you dilute it."
				)
				(Print y: 165 addText: 62 25 0 1 0 0 16 init:) ; "The potion probably won't work as well if you dilute it."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 62 25 0 1) ; "The potion probably won't work as well if you dilute it."
				)
			)
			(51 ; theRehydrator
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
				(Print y: 165 addText: 59 18 0 1 0 0 16 init:) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theHeals of NumInvItem
	(properties
		noun 62
		message 18
		mainView 905
		mainLoop 2
		mainCel 6
		value 5
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 62 1 0 1 (temp0 data:)) ; "Healing Potion"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 62 1 0 2) ; "It's a Healing Potion, just another of the wonders science has brought to modern medicine. (It's undoubtedly magical, but it would probably be best if you didn't mention that to Dr. Cranium.)"
					)
					(Print y: 165 addText: 62 1 0 2 0 0 16 init:) ; "It's a Healing Potion, just another of the wonders science has brought to modern medicine. (It's undoubtedly magical, but it would probably be best if you didn't mention that to Dr. Cranium.)"
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 62 1 0 2) ; "It's a Healing Potion, just another of the wonders science has brought to modern medicine. (It's undoubtedly magical, but it would probably be best if you didn't mention that to Dr. Cranium.)"
					)
				else
					(Message msgGET 16 62 1 0 1 (temp0 data:)) ; "Healing Potion"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(17 ; theCures
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
				(Print y: 165 addText: 59 18 0 1 0 0 16 init:) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
			)
			(25 ; theWater
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 62 25 0 1) ; "The potion probably won't work as well if you dilute it."
				)
				(Print y: 165 addText: 62 25 0 1 0 0 16 init:) ; "The potion probably won't work as well if you dilute it."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 62 25 0 1) ; "The potion probably won't work as well if you dilute it."
				)
			)
			(51 ; theRehydrator
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
				(Print y: 165 addText: 59 18 0 1 0 0 16 init:) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 59 18 0 1) ; "Mixing potions isn't a good idea. They have a bad habit of exploding when combined improperly."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theRations of NumInvItem
	(properties
		noun 29
		message 19
		mainView 905
		mainCel 8
		value 20
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 29 1 0 1 (temp0 data:)) ; "Rations"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 29 1 0 2) ; "These avocado and garlic sandwiches are the strangest adventuring meals you've encountered. Still, they do last a long time and will keep you from starving to death. (Of course, you may WISH you'd starved to death if you have to eat them too often.)"
					)
					(Print y: 165 addText: 29 1 0 2 0 0 16 init:) ; "These avocado and garlic sandwiches are the strangest adventuring meals you've encountered. Still, they do last a long time and will keep you from starving to death. (Of course, you may WISH you'd starved to death if you have to eat them too often.)"
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 29 1 0 2) ; "These avocado and garlic sandwiches are the strangest adventuring meals you've encountered. Still, they do last a long time and will keep you from starving to death. (Of course, you may WISH you'd starved to death if you have to eat them too often.)"
					)
				else
					(Message msgGET 16 29 1 0 1 (temp0 data:)) ; "Rations"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 29 37 0 1) ; "Going on cut rations won't help you; being a Hero is hungry work!"
				)
				(Print y: 165 addText: 29 37 0 1 0 0 16 init:) ; "Going on cut rations won't help you; being a Hero is hungry work!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 29 37 0 1) ; "Going on cut rations won't help you; being a Hero is hungry work!"
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 29 76 0 1) ; "Unbelievable as it may seem, these rations taste even WORSE when you cook them!"
				)
				(Print y: 165 addText: 29 76 0 1 0 0 16 init:) ; "Unbelievable as it may seem, these rations taste even WORSE when you cook them!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 29 76 0 1) ; "Unbelievable as it may seem, these rations taste even WORSE when you cook them!"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theThrowdagger of NumInvItem
	(properties
		noun 61
		message 37
		mainView 905
		mainLoop 2
		mainCel 2
		value 90
	)

	(method (doVerb theVerb)
		(switch theVerb
			(32 ; theOil
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 61 32 0 1) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				)
				(Print y: 165 addText: 61 32 0 1 0 0 16 init:) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 61 32 0 1) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				)
			)
			(39 ; theFlint
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 61 39 0 1) ; "Try that the other way around."
				)
				(Print y: 165 addText: 61 39 0 1 0 0 16 init:) ; "Try that the other way around."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 61 39 0 1) ; "Try that the other way around."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theRocks of NumInvItem
	(properties
		noun 38
		message 21
		mainView 905
		mainLoop 2
		mainCel 9
		value 30
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 38 1 0 1 (temp0 data:)) ; "Rocks"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 38 1 0 2) ; "Igneous, sedimentary, or metamorphic -- you never can remember which is which."
					)
					(Print y: 165 addText: 38 1 0 2 0 0 16 init:) ; "Igneous, sedimentary, or metamorphic -- you never can remember which is which."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 38 1 0 2) ; "Igneous, sedimentary, or metamorphic -- you never can remember which is which."
					)
				else
					(Message msgGET 16 38 1 0 1 (temp0 data:)) ; "Rocks"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 38 37 0 1) ; "Whatever kind of rocks these are, they evidently AREN'T flint. No spark rewards you."
				)
				(Print y: 165 addText: 38 37 0 1 0 0 16 init:) ; "Whatever kind of rocks these are, they evidently AREN'T flint. No spark rewards you."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 38 37 0 1) ; "Whatever kind of rocks these are, they evidently AREN'T flint. No spark rewards you."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theCandle of NumInvItem
	(properties
		noun 9
		message 22
		mainView 905
		mainLoop 6
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(25 ; theWater
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 9 25 0 1) ; "Don't bother; it isn't lit."
				)
				(Print y: 165 addText: 9 25 0 1 0 0 16 init:) ; "Don't bother; it isn't lit."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 9 25 0 1) ; "Don't bother; it isn't lit."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 9 76 0 1) ; "You try to light the candle with the magic torch, but it won't stay lit. Maybe if the candle had a wick it would work better."
				)
				(Print y: 165 addText: 9 76 0 1 0 0 16 init:) ; "You try to light the candle with the magic torch, but it won't stay lit. Maybe if the candle had a wick it would work better."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 9 76 0 1) ; "You try to light the candle with the magic torch, but it won't stay lit. Maybe if the candle had a wick it would work better."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theCandy of NumInvItem
	(properties
		noun 10
		message 23
		mainView 905
		mainLoop 8
		mainCel 4
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(45 ; theCorn
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 10 45 0 1) ; "Is that how you make "candy corn"? This doesn't seem quite right somehow."
				)
				(Print y: 165 addText: 10 45 0 1 0 0 16 init:) ; "Is that how you make "candy corn"? This doesn't seem quite right somehow."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 10 45 0 1) ; "Is that how you make "candy corn"? This doesn't seem quite right somehow."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theFlask of NumInvItem
	(properties
		noun 13
		message 24
		mainView 905
		mainLoop 2
		mainCel 5
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(17 ; theCures
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 13 18 0 1) ; "You pour the potion into the empty flask."
				)
				(Print y: 165 addText: 13 18 0 1 0 0 16 init:) ; "You pour the potion into the empty flask."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 13 18 0 1) ; "You pour the potion into the empty flask."
				)
			)
			(18 ; theHeals
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 13 18 0 1) ; "You pour the potion into the empty flask."
				)
				(Print y: 165 addText: 13 18 0 1 0 0 16 init:) ; "You pour the potion into the empty flask."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 13 18 0 1) ; "You pour the potion into the empty flask."
				)
			)
			(26 ; theGruegoo
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 13 26 0 1) ; "No sense in ruining another flask!"
				)
				(Print y: 165 addText: 13 26 0 1 0 0 16 init:) ; "No sense in ruining another flask!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 13 26 0 1) ; "No sense in ruining another flask!"
				)
			)
			(27 ; theBonemeal
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 13 27 0 1) ; "You transfer the bone meal into another flask."
				)
				(Print y: 165 addText: 13 27 0 1 0 0 16 init:) ; "You transfer the bone meal into another flask."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 13 27 0 1) ; "You transfer the bone meal into another flask."
				)
			)
			(51 ; theRehydrator
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 13 18 0 1) ; "You pour the potion into the empty flask."
				)
				(Print y: 165 addText: 13 18 0 1 0 0 16 init:) ; "You pour the potion into the empty flask."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 13 18 0 1) ; "You pour the potion into the empty flask."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theWater of NumInvItem
	(properties
		noun 64
		message 25
		mainView 905
		mainCel 11
		value 20
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 64 1 0 1 (temp0 data:)) ; "Water"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 64 1 0 2) ; "It looks like water, smells like water, but it's actually... water."
					)
					(Print y: 165 addText: 64 1 0 2 0 0 16 init:) ; "It looks like water, smells like water, but it's actually... water."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 64 1 0 2) ; "It looks like water, smells like water, but it's actually... water."
					)
				else
					(Message msgGET 16 64 1 0 1 (temp0 data:)) ; "Water"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(51 ; theRehydrator
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 64 51 0 1) ; "The water is already quite wet enough."
				)
				(Print y: 165 addText: 64 51 0 1 0 0 16 init:) ; "The water is already quite wet enough."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 64 51 0 1) ; "The water is already quite wet enough."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 64 76 0 1) ; "You boil some water. Why? Is someone having a baby?"
				)
				(Print y: 165 addText: 64 76 0 1 0 0 16 init:) ; "You boil some water. Why? Is someone having a baby?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 64 76 0 1) ; "You boil some water. Why? Is someone having a baby?"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theGruegoo of NumInvItem
	(properties
		noun 14
		message 26
		mainView 905
		mainLoop 6
		mainCel 10
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(46 ; thePiepan
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 30 46 0 1) ; "Try that the other way around. The pie ingredients go in the pie pan, not the pie pan in the ingredients."
				)
				(Print y: 165 addText: 30 46 0 1 0 0 16 init:) ; "Try that the other way around. The pie ingredients go in the pie pan, not the pie pan in the ingredients."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 30 46 0 1) ; "Try that the other way around. The pie ingredients go in the pie pan, not the pie pan in the ingredients."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theBonemeal of NumInvItem
	(properties
		noun 15
		message 27
		mainView 905
		mainLoop 6
		mainCel 8
		value 2
	)
)

(instance theLockpick of NumInvItem
	(properties
		noun 68
		message 28
		mainView 905
		mainLoop 10
		mainCel 9
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 68 1 0 1 (temp0 data:)) ; "Lockpick"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 68 1 0 2) ; "This is a basic beginner's lockpick, only usable on common locks."
					)
					(Print y: 165 addText: 68 1 0 2 0 0 16 init:) ; "This is a basic beginner's lockpick, only usable on common locks."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 68 1 0 2) ; "This is a basic beginner's lockpick, only usable on common locks."
					)
				else
					(Message msgGET 16 68 1 0 1 (temp0 data:)) ; "Lockpick"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theKeyRing of NumInvItem
	(properties
		noun 16
		message 29
		mainView 905
		mainLoop 2
		mainCel 15
		value 1
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 16 1 0 1 (temp0 data:)) ; "Key Ring"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (not maskCel)
						(Print y: 165 addText: 0 29 12 1 0 0 16 init:) ; "You don't have any keys."
					else
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 16 1 0 2) ; "This ring contains the keys you've found during your quest."
						)
						(Print y: 165 addText: 16 1 0 2 0 0 16 init:) ; "This ring contains the keys you've found during your quest."
						(if (IsFlag 400)
							(gGlory masterVolume: local0)
							(DoAudio audSTOP 16 16 1 0 2) ; "This ring contains the keys you've found during your quest."
						)
						(if (& maskCel $0001)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 16 1 21 1) ; "One of the keys opens the door to Dr. Cranium's laboratory."
							)
							(Print y: 165 addText: 16 1 21 1 0 0 16 init:) ; "One of the keys opens the door to Dr. Cranium's laboratory."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 16 1 21 1) ; "One of the keys opens the door to Dr. Cranium's laboratory."
							)
						)
						(if (& maskCel $0002)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 16 1 56 1) ; "You have a key for your storage locker at the inn."
							)
							(Print y: 165 addText: 16 1 56 1 0 0 16 init:) ; "You have a key for your storage locker at the inn."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 16 1 56 1) ; "You have a key for your storage locker at the inn."
							)
						)
						(if (& maskCel $0004)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 16 1 27 1) ; "The key to the Borgov's crypt is on the ring."
							)
							(Print y: 165 addText: 16 1 27 1 0 0 16 init:) ; "The key to the Borgov's crypt is on the ring."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 16 1 27 1) ; "The key to the Borgov's crypt is on the ring."
							)
						)
						(if (& maskCel $0008)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 16 1 28 1) ; "You have the Adventurer's Guild key."
							)
							(Print y: 165 addText: 16 1 28 1 0 0 16 init:) ; "You have the Adventurer's Guild key."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 16 1 28 1) ; "You have the Adventurer's Guild key."
							)
						)
						(if (& maskCel $0010)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 16 1 38 1) ; "One key opens the secret passageway in the crypt."
							)
							(Print y: 165 addText: 16 1 38 1 0 0 16 init:) ; "One key opens the secret passageway in the crypt."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 16 1 38 1) ; "One key opens the secret passageway in the crypt."
							)
						)
						(if (& maskCel $0020)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 16 1 54 1) ; "You have a large iron key from the Burgomeister's desk."
							)
							(Print y: 165 addText: 16 1 54 1 0 0 16 init:) ; "You have a large iron key from the Burgomeister's desk."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 16 1 54 1) ; "You have a large iron key from the Burgomeister's desk."
							)
						)
					)
				else
					(Message msgGET 16 16 1 0 1 (temp0 data:)) ; "Key Ring"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(42 ; theToolkit
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 16 42 0 1) ; "You could probably use the toolkit to get the keys off the ring, but why bother?"
				)
				(Print y: 165 addText: 16 42 0 1 0 0 16 init:) ; "You could probably use the toolkit to get the keys off the ring, but why bother?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 16 42 0 1) ; "You could probably use the toolkit to get the keys off the ring, but why bother?"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theOil of NumInvItem
	(properties
		noun 40
		message 32
		mainView 905
		mainCel 9
		value 30
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 40 1 0 1 (temp0 data:)) ; "Oil"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 40 1 0 2) ; "The container's label reads "Squeaky Greaser (tm).""
					)
					(Print y: 165 addText: 40 1 0 2 0 0 16 init:) ; "The container's label reads "Squeaky Greaser (tm).""
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 40 1 0 2) ; "The container's label reads "Squeaky Greaser (tm).""
					)
				else
					(Message msgGET 16 40 1 0 1 (temp0 data:)) ; "Oil"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 40 76 0 1) ; "You don't have enough oil to make a decent oil fire."
				)
				(Print y: 165 addText: 40 76 0 1 0 0 16 init:) ; "You don't have enough oil to make a decent oil fire."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 40 76 0 1) ; "You don't have enough oil to make a decent oil fire."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theGrapnel of NumInvItem
	(properties
		noun 12
		message 33
		mainView 905
		mainLoop 2
		mainCel 11
		value 80
	)
)

(instance theArmor of NumInvItem
	(properties
		noun 57
		message 34
		mainView 905
		mainCel 2
		value 2100
	)

	(method (show)
		(if state
			(= cel 13)
		else
			(= cel 2)
		)
		(super show: &rest)
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 57 1 0 1) ; "Armor"
					)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(if state
						(Message msgGET 16 57 1 37 1 (temp0 data:)) ; "Platemail Armor"
					else
						(Message msgGET 16 57 1 36 1 (temp0 data:)) ; "Leather Armor"
					)
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 57 1 0 1) ; "Armor"
					)
					(if state
						(Print addText: 57 theVerb 37 2 0 0 16) ; "The platemail armor consists of sections of metal plates welded to flexible chain links for superior protection. You wear leather padding underneath the armor."
					else
						(Print addText: 57 theVerb 36 2 0 0 16) ; "Leather armor provides you some protection against enemy attacks, helps keep you warm on these cool Autumn evenings, and generally makes a modern fashion statement."
					)
					(Print y: 165 init:)
				else
					(if state
						(Message msgGET 16 57 1 37 1 (temp0 data:)) ; "Platemail Armor"
					else
						(Message msgGET 16 57 1 36 1 (temp0 data:)) ; "Leather Armor"
					)
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(32 ; theOil
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 57 32 0 1) ; "You rub some of the oil into your armor. There's nothing like keeping your equipment in top shape."
				)
				(Print y: 165 addText: 57 32 0 1 0 0 16 init:) ; "You rub some of the oil into your armor. There's nothing like keeping your equipment in top shape."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 57 32 0 1) ; "You rub some of the oil into your armor. There's nothing like keeping your equipment in top shape."
				)
			)
			(42 ; theToolkit
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 57 42 0 1) ; "Your armor doesn't need to be repaired right now."
				)
				(Print y: 165 addText: 57 42 0 1 0 0 16 init:) ; "Your armor doesn't need to be repaired right now."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 57 42 0 1) ; "Your armor doesn't need to be repaired right now."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theShield of NumInvItem
	(properties
		noun 11
		message 35
		mainView 905
		mainCel 3
		value 720
	)

	(method (show)
		(switch state
			(0
				(= loop 0)
				(= cel 3)
			)
			(1
				(= loop 8)
				(= cel 13)
			)
		)
		(super show: &rest)
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
				(switch state
					(0
						(Message msgGET 16 11 theVerb 0 1 (temp0 data:))
					)
					(1
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 11 1 50 1) ; "Piotyr's Shield"
						)
						(Message msgGET 16 11 theVerb 50 1 (temp0 data:))
					)
				)
				(if (== local3 gEgo)
					(temp1 format: (temp1 data:) (temp0 data:) value)
					(Print addText: (temp1 data:) y: 165 init:)
					(switch state
						(0
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 11 1 0 2) ; "The best offense requires good defense. This shield helps keep you alive long enough to do both."
							)
							(Print addText: 11 theVerb 0 2 0 0 16 y: 165 init:) ; "The best offense requires good defense. This shield helps keep you alive long enough to do both."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 11 1 0 2) ; "The best offense requires good defense. This shield helps keep you alive long enough to do both."
							)
						)
						(1
							(if (IsFlag 400)
								(DoAudio audSTOP 16 11 1 50 1) ; "Piotyr's Shield"
								(DoAudio audPLAY 16 11 1 50 2) ; "Piotyr's shield glows faintly with the force of magical protection."
							)
							(Print addText: 11 theVerb 50 2 0 0 16 y: 165 init:) ; "Piotyr's shield glows faintly with the force of magical protection."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 11 1 50 2) ; "Piotyr's shield glows faintly with the force of magical protection."
							)
						)
					)
				else
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(171 ; theHammer
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 11 171 0 1) ; "You bang on the shield with the iron hammer. Ringo Starr you ain't."
				)
				(Print y: 165 addText: 11 171 0 1 0 0 16 init:) ; "You bang on the shield with the iron hammer. Ringo Starr you ain't."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 11 171 0 1) ; "You bang on the shield with the iron hammer. Ringo Starr you ain't."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theSword of NumInvItem
	(properties
		noun 54
		message 36
		mainView 905
		mainCel 12
		value 420
	)

	(method (show)
		(switch state
			(0
				(= loop 0)
				(= cel 12)
			)
			(1
				(= cel (= loop 0))
			)
			(2
				(= loop 0)
				(= cel 15)
			)
			(3
				(= loop 0)
				(= cel 14)
			)
		)
		(super show: &rest)
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
				(switch state
					(0
						(Message msgGET 16 0 1 19 1 (temp0 data:)) ; "Sword"
					)
					(1
						(Message msgGET 16 0 1 18 1 (temp0 data:)) ; "Fine Sword"
					)
					(2
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 0 1 35 1) ; "Battle Axe"
						)
						(Message msgGET 16 0 1 35 1 (temp0 data:)) ; "Battle Axe"
					)
					(3
						(Message msgGET 16 0 1 49 1 (temp0 data:)) ; "Piotyr's Sword"
					)
				)
				(if (== local3 gEgo)
					(temp1 format: (temp1 data:) (temp0 data:) value)
					(Print addText: (temp1 data:) y: 165 init:)
					(switch state
						(0
							(Print addText: 0 theVerb 19 2 0 0 16 y: 165 init:) ; "This sword is rather battered and worn; you can't get it to hold a proper temper. Still, it's better than fighting barehanded (or even with a dagger)."
						)
						(1
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 54 1 0 2) ; "This is your trusty broadsword."
							)
							(Print addText: 0 theVerb 18 2 0 0 16 y: 165 init:) ; "You have a high-quality, well-balanced sword from the urgent care section of the Adventurers' Guild."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 54 1 0 2) ; "This is your trusty broadsword."
							)
						)
						(2
							(if (IsFlag 400)
								(DoAudio audSTOP 16 0 1 35 1) ; "Battle Axe"
								(DoAudio audPLAY 16 0 1 35 2) ; "You wrested this awesome battle axe from the barrow of a mighty Wraith."
							)
							(Print addText: 0 theVerb 35 2 0 0 16 y: 165 init:) ; "You wrested this awesome battle axe from the barrow of a mighty Wraith."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 0 1 35 2) ; "You wrested this awesome battle axe from the barrow of a mighty Wraith."
							)
						)
						(3
							(Print addText: 0 theVerb 49 2 0 0 16 y: 165 init:) ; "This magical sword has powerful combat and defensive abilities in the hands of a Paladin such as yourself."
						)
					)
				else
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(32 ; theOil
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 61 32 0 1) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				)
				(Print y: 165 addText: 61 32 0 1 0 0 16 init:) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 61 32 0 1) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theDagger of NumInvItem
	(properties
		noun 61
		message 37
		mainView 905
		mainCel 1
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(32 ; theOil
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 61 32 0 1) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				)
				(Print y: 165 addText: 61 32 0 1 0 0 16 init:) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 61 32 0 1) ; "You rub a bit of oil onto your weapon to keep it rust-free."
				)
			)
			(39 ; theFlint
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 61 39 0 1) ; "Try that the other way around."
				)
				(Print y: 165 addText: 61 39 0 1 0 0 16 init:) ; "Try that the other way around."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 61 39 0 1) ; "Try that the other way around."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theFlint of NumInvItem
	(properties
		noun 20
		message 39
		mainView 905
		mainCel 4
		value 2
	)

	(method (doVerb theVerb &tmp temp0)
		(switch theVerb
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 20 37 0 1) ; "You scrape the flint with your dagger, creating a spark."
				)
				(Print addText: 20 37 0 1 0 0 16 y: 165 init:) ; "You scrape the flint with your dagger, creating a spark."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 20 37 0 1) ; "You scrape the flint with your dagger, creating a spark."
				)
			)
			(76 ; theTorch
				(if (gEgo has: 5) ; theThrowdagger
					((= temp0 (ScriptID 35 16)) cel: 10 state: 1) ; theTorch
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 69 39 0 1) ; "You strike a spark with the flint and dagger to light the torch."
					)
					(Print addText: 69 39 0 1 0 0 16 y: 165 init:) ; "You strike a spark with the flint and dagger to light the torch."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 69 39 0 1) ; "You strike a spark with the flint and dagger to light the torch."
					)
					(Cursor loop: 8 cel: 10)
					(SetCursor 905 8 10)
					((gTheIconBar at: 6) cursorCel: 10)
					((= temp0 (ScriptID 36 1)) cel: 10 show:) ; invItem
					(gInventory drawInvItems:)
					(FrameOut)
					(gEgo solvePuzzle: 401 6)
					(gCurRoom doTorch: 1)
				else
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 69 39 55 1) ; "It takes flint AND steel to make a spark. You only have the flint."
					)
					(Print addText: 69 39 55 1 0 0 16 y: 165 init:) ; "It takes flint AND steel to make a spark. You only have the flint."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 69 39 55 1) ; "It takes flint AND steel to make a spark. You only have the flint."
					)
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theGarlic of NumInvItem
	(properties
		noun 21
		message 40
		mainView 905
		mainLoop 2
		mainCel 1
		value 2
	)

	(method (doVerb theVerb &tmp temp0)
		(switch theVerb
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 21 37 0 1) ; "Yes, that's the right way to dice garlic. But a master chef you're not."
				)
				(Print addText: 21 37 0 1 0 0 16 y: 165 init:) ; "Yes, that's the right way to dice garlic. But a master chef you're not."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 21 37 0 1) ; "Yes, that's the right way to dice garlic. But a master chef you're not."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 21 76 0 1) ; "Aren't you getting enough cooked garlic at the Inn?"
				)
				(Print addText: 21 76 0 1 0 0 16 y: 165 init:) ; "Aren't you getting enough cooked garlic at the Inn?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 21 76 0 1) ; "Aren't you getting enough cooked garlic at the Inn?"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theGuildcard of NumInvItem
	(properties
		noun 23
		message 41
		mainView 905
		mainLoop 2
		mainCel 12
		value 2
	)
)

(instance theToolkit of NumInvItem
	(properties
		noun 22
		message 42
		mainView 905
		mainLoop 4
		mainCel 13
		value 30
	)
)

(instance theDarksign of NumInvItem
	(properties
		noun 24
		message 43
		mainView 905
		mainLoop 6
		mainCel 5
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(56 ; theAmulet
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 24 56 0 1) ; "Sparks jump between the Undead Amulet and the Dark One Sign when you bring them close together; they don't seem to get along very well."
				)
				(Print y: 165 addText: 24 56 0 1 0 0 16 init:) ; "Sparks jump between the Undead Amulet and the Dark One Sign when you bring them close together; they don't seem to get along very well."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 24 56 0 1) ; "Sparks jump between the Undead Amulet and the Dark One Sign when you bring them close together; they don't seem to get along very well."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theHat of NumInvItem
	(properties
		noun 25
		message 44
		mainView 905
		mainLoop 6
		mainCel 7
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 25 1 0 1 (temp0 data:)) ; "Hat"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 25 1 0 2) ; "It's a faded, well-worn hat. If it's seen better days, they must have been years ago."
					)
					(Print y: 165 addText: 25 1 0 2 0 0 16 init:) ; "It's a faded, well-worn hat. If it's seen better days, they must have been years ago."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 25 1 0 2) ; "It's a faded, well-worn hat. If it's seen better days, they must have been years ago."
					)
				else
					(Message msgGET 16 25 1 0 1 (temp0 data:)) ; "Hat"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(55 ; theChicken
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 25 55 0 1) ; "Fortunately, you don't have any way to attach the rubber chicken to the hat. It really looks stupid there!"
				)
				(Print y: 165 addText: 25 55 0 1 0 0 16 init:) ; "Fortunately, you don't have any way to attach the rubber chicken to the hat. It really looks stupid there!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 25 55 0 1) ; "Fortunately, you don't have any way to attach the rubber chicken to the hat. It really looks stupid there!"
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 74 76 0 1) ; "Why do you have this burning desire to immolate your possessions?"
				)
				(Print y: 165 addText: 74 76 0 1 0 0 16 init:) ; "Why do you have this burning desire to immolate your possessions?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 74 76 0 1) ; "Why do you have this burning desire to immolate your possessions?"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theCorn of NumInvItem
	(properties
		noun 26
		message 45
		mainView 905
		mainLoop 6
		mainCel 4
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(23 ; theCandy
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 10 45 0 1) ; "Is that how you make "candy corn"? This doesn't seem quite right somehow."
				)
				(Print y: 165 addText: 10 45 0 1 0 0 16 init:) ; "Is that how you make "candy corn"? This doesn't seem quite right somehow."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 10 45 0 1) ; "Is that how you make "candy corn"? This doesn't seem quite right somehow."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 26 76 0 1) ; "Want to make popcorn? The kernel would disapprove."
				)
				(Print y: 165 addText: 26 76 0 1 0 0 16 init:) ; "Want to make popcorn? The kernel would disapprove."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 26 76 0 1) ; "Want to make popcorn? The kernel would disapprove."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance thePiepan of NumInvItem
	(properties
		noun 27
		message 46
		mainView 905
		mainLoop 2
		mainCel 10
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 27 1 0 1 (temp0 data:)) ; "Pie Pan"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 27 1 0 2) ; "This is a metal pie tin, perfect for fruit pies."
					)
					(Print y: 165 addText: 27 1 0 2 0 0 16 init:) ; "This is a metal pie tin, perfect for fruit pies."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 27 1 0 2) ; "This is a metal pie tin, perfect for fruit pies."
					)
					(if (& maskCel $0001)
						(Print addText: 27 1 15 0 0 0 16 y: 165 init:) ; "The pan is filled with a sickly red assemblage of poisonous Elderbury berries."
					)
					(if (& maskCel $0002)
						(Print addText: 27 1 14 0 0 0 16 y: 165 init:) ; "The pan has been thoroughly greased with Grue Goo."
					)
					(if (& maskCel $0004)
						(Print addText: 27 1 20 0 0 0 16 y: 165 init:) ; "Ground-up human bones make up the "flour" in the pan."
					)
				else
					(Message msgGET 16 27 1 0 1 (temp0 data:)) ; "Pie Pan"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(48 ; theBerries
				(if (== (gTheIconBar curInvIcon:) theBerries)
					(localproc_0)
				)
				(theBerries amount: 0)
				(= loop (= cel 6))
				(|= maskCel $0001)
				(+= value (theBerries value:))
				(theBerries signal: 4)
				(DeleteScreenItem theBerries)
				(gInventory drawInvItems:)
				(gInventory advanceCurIcon:)
				(FrameOut)
				(Print y: 165 addText: noun 48 0 0 0 0 16 init:) ; "You toss the Elderburies into the pie tin."
			)
			(27 ; theBonemeal
				(if
					(and
						(== (gTheIconBar curInvIcon:) theBonemeal)
						(== (theBonemeal amount:) 1)
					)
					(localproc_0)
				)
				(theBonemeal amount: (- (theBonemeal amount:) 1))
				(= loop (= cel 6))
				(+= value (theBonemeal value:))
				(if (< (theBonemeal amount:) 1)
					(theBonemeal signal: 4)
					(DeleteScreenItem theBonemeal)
				)
				(theFlask
					amount: (+ (theFlask amount:) 1)
					owner: (gInventory owner:)
					signal: (& (theFlask signal:) $fffb)
				)
				(AddScreenItem theFlask)
				(gInventory drawInvItems:)
				(gInventory advanceCurIcon:)
				(FrameOut)
				(|= maskCel $0004)
				(Print addText: noun 27 0 0 0 0 16 y: 165 init:) ; "You pour the bone meal into the pie tin, then put the empty flask back in your pack."
			)
			(26 ; theGruegoo
				(if
					(and
						(== (gTheIconBar curInvIcon:) theGruegoo)
						(== (theGruegoo amount:) 1)
					)
					(localproc_0)
				)
				(theGruegoo amount: (- (theGruegoo amount:) 1))
				(= loop (= cel 6))
				(+= value (theGruegoo value:))
				(if (< (theGruegoo amount:) 1)
					(theGruegoo signal: 4)
					(DeleteScreenItem theGruegoo)
				)
				(if (== (gInventory owner:) gEgo)
					(theFlask amount: (+ (theFlask amount:) 1))
				else
					(theFlask chestAmout: (+ (theFlask chestAmout:) 1))
				)
				(theFlask
					owner: (gInventory owner:)
					signal: (& (theFlask signal:) $fffb)
				)
				(AddScreenItem theFlask)
				(gInventory drawInvItems:)
				(gInventory advanceCurIcon:)
				(FrameOut)
				(|= maskCel $0002)
				(Print addText: noun 26 0 0 0 0 16 y: 165 init:) ; "After interminable minutes, the last of the gooey Grue goo splurches into the pie pan; you rub the slimy flask clean and put it away."
			)
			(53 ; theBlackbird
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 27 53 0 1) ; "What do you think this is, Mixed-Up Fairy Tales? Besides, you only have ONE black bird, not nearly enough to bake a proper pie."
				)
				(Print y: 165 addText: 27 53 0 1 0 0 16 init:) ; "What do you think this is, Mixed-Up Fairy Tales? Besides, you only have ONE black bird, not nearly enough to bake a proper pie."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 27 53 0 1) ; "What do you think this is, Mixed-Up Fairy Tales? Besides, you only have ONE black bird, not nearly enough to bake a proper pie."
				)
			)
			(55 ; theChicken
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 27 55 0 1) ; "The pan's too small to make rubber chicken stew."
				)
				(Print y: 165 addText: 27 55 0 1 0 0 16 init:) ; "The pan's too small to make rubber chicken stew."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 27 55 0 1) ; "The pan's too small to make rubber chicken stew."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 27 76 0 1) ; "The torch's flame isn't hot enough to cook the pie. You'll need to find a much more powerful heat source."
				)
				(Print y: 165 addText: 27 76 0 1 0 0 16 init:) ; "The torch's flame isn't hot enough to cook the pie. You'll need to find a much more powerful heat source."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 27 76 0 1) ; "The torch's flame isn't hot enough to cook the pie. You'll need to find a much more powerful heat source."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theBones of NumInvItem
	(properties
		noun 28
		message 47
		mainView 905
		mainLoop 6
		mainCel 15
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 28 37 0 1) ; "Careful scraping reveals that the bones are indeed bones."
				)
				(Print y: 165 addText: 28 37 0 1 0 0 16 init:) ; "Careful scraping reveals that the bones are indeed bones."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 28 37 0 1) ; "Careful scraping reveals that the bones are indeed bones."
				)
			)
			(56 ; theAmulet
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 45 47 0 1) ; "You test the Undead Amulet on the bones. Nothing happens since the bones aren't "undead.""
				)
				(Print y: 165 addText: 45 47 0 1 0 0 16 init:) ; "You test the Undead Amulet on the bones. Nothing happens since the bones aren't "undead.""
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 45 47 0 1) ; "You test the Undead Amulet on the bones. Nothing happens since the bones aren't "undead.""
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theBerries of NumInvItem
	(properties
		noun 30
		message 48
		mainView 905
		mainLoop 6
		mainCel 14
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(46 ; thePiepan
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 30 46 0 1) ; "Try that the other way around. The pie ingredients go in the pie pan, not the pie pan in the ingredients."
				)
				(Print y: 165 addText: 30 46 0 1 0 0 16 init:) ; "Try that the other way around. The pie ingredients go in the pie pan, not the pie pan in the ingredients."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 30 46 0 1) ; "Try that the other way around. The pie ingredients go in the pie pan, not the pie pan in the ingredients."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 30 76 0 1) ; "You can't cook the loose berries; you have to make a pie first!"
				)
				(Print y: 165 addText: 30 76 0 1 0 0 16 init:) ; "You can't cook the loose berries; you have to make a pie first!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 30 76 0 1) ; "You can't cook the loose berries; you have to make a pie first!"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theHumorbar of NumInvItem
	(properties
		noun 31
		message 49
		mainView 905
		mainLoop 4
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 31 1 0 1 (temp0 data:)) ; "Good Humor Bar"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 31 1 0 2) ; "While this bears a passing resemblance to an ice cream bar on a stick, it hasn't melted the whole time you've been carrying it. It feels kind of funny in your hand."
					)
					(Print y: 165 addText: 31 1 0 2 0 0 16 init:) ; "While this bears a passing resemblance to an ice cream bar on a stick, it hasn't melted the whole time you've been carrying it. It feels kind of funny in your hand."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 31 1 0 2) ; "While this bears a passing resemblance to an ice cream bar on a stick, it hasn't melted the whole time you've been carrying it. It feels kind of funny in your hand."
					)
				else
					(Message msgGET 16 31 1 0 1 (temp0 data:)) ; "Good Humor Bar"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 31 76 0 1) ; "Baked Alaska? O.k., Alaska. She says, "No thanks.""
				)
				(Print y: 165 addText: 31 76 0 1 0 0 16 init:) ; "Baked Alaska? O.k., Alaska. She says, "No thanks.""
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 31 76 0 1) ; "Baked Alaska? O.k., Alaska. She says, "No thanks.""
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theRehydrator of NumInvItem
	(properties
		noun 33
		message 51
		mainView 905
		mainCel 11
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== local3 gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 33 1 0 1 (temp0 data:)) ; "Rehydration Solution"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 33 1 0 2) ; "Dr. Cranium's patented Rehydration Solution bears a suspicious resemblance to a flask of ordinary water."
					)
					(Print y: 165 addText: 33 1 0 2 0 0 16 init:) ; "Dr. Cranium's patented Rehydration Solution bears a suspicious resemblance to a flask of ordinary water."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 33 1 0 2) ; "Dr. Cranium's patented Rehydration Solution bears a suspicious resemblance to a flask of ordinary water."
					)
				else
					(Message msgGET 16 33 1 0 1 (temp0 data:)) ; "Rehydration Solution"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(25 ; theWater
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 62 25 0 1) ; "The potion probably won't work as well if you dilute it."
				)
				(Print y: 165 addText: 62 25 0 1 0 0 16 init:) ; "The potion probably won't work as well if you dilute it."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 62 25 0 1) ; "The potion probably won't work as well if you dilute it."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 33 76 0 1) ; "Now look what you've done! You've made the Rehydration Potion boiling mad! (Or at least boiling.) Fortunately, its temper cools quickly."
				)
				(Print y: 165 addText: 33 76 0 1 0 0 16 init:) ; "Now look what you've done! You've made the Rehydration Potion boiling mad! (Or at least boiling.) Fortunately, its temper cools quickly."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 33 76 0 1) ; "Now look what you've done! You've made the Rehydration Potion boiling mad! (Or at least boiling.) Fortunately, its temper cools quickly."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theDoll of NumInvItem
	(properties
		noun 34
		message 52
		mainView 905
		mainCel 7
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(36 ; theSword
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 34 37 0 1) ; "The doll wouldn't look as good without a head."
				)
				(Print y: 165 addText: 34 37 0 1 0 0 16 init:) ; "The doll wouldn't look as good without a head."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 34 37 0 1) ; "The doll wouldn't look as good without a head."
				)
			)
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 34 37 0 1) ; "The doll wouldn't look as good without a head."
				)
				(Print y: 165 addText: 34 37 0 1 0 0 16 init:) ; "The doll wouldn't look as good without a head."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 34 37 0 1) ; "The doll wouldn't look as good without a head."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 74 76 0 1) ; "Why do you have this burning desire to immolate your possessions?"
				)
				(Print y: 165 addText: 74 76 0 1 0 0 16 init:) ; "Why do you have this burning desire to immolate your possessions?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 74 76 0 1) ; "Why do you have this burning desire to immolate your possessions?"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theBlackbird of NumInvItem
	(properties
		noun 58
		message 53
		mainView 905
		mainLoop 4
		mainCel 11
		value 30
	)

	(method (doVerb theVerb)
		(switch theVerb
			(36 ; theSword
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 58 36 0 1) ; "You'd better not; you'd wreck the black bird sculpture."
				)
				(Print y: 165 addText: 58 36 0 1 0 0 16 init:) ; "You'd better not; you'd wreck the black bird sculpture."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 58 36 0 1) ; "You'd better not; you'd wreck the black bird sculpture."
				)
			)
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 58 37 0 1) ; "Carefully scraping at the black falcon, you discover that it's just a cheap plaster sculpture. You still haven't found the one everyone's looking for."
				)
				(Print y: 165 addText: 58 37 0 1 0 0 16 init:) ; "Carefully scraping at the black falcon, you discover that it's just a cheap plaster sculpture. You still haven't found the one everyone's looking for."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 58 37 0 1) ; "Carefully scraping at the black falcon, you discover that it's just a cheap plaster sculpture. You still haven't found the one everyone's looking for."
				)
			)
			(45 ; theCorn
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 58 45 0 1) ; "No thanks; the bird sculpture isn't hungry."
				)
				(Print y: 165 addText: 58 45 0 1 0 0 16 init:) ; "No thanks; the bird sculpture isn't hungry."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 58 45 0 1) ; "No thanks; the bird sculpture isn't hungry."
				)
			)
			(171 ; theHammer
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 58 36 0 1) ; "You'd better not; you'd wreck the black bird sculpture."
				)
				(Print y: 165 addText: 58 36 0 1 0 0 16 init:) ; "You'd better not; you'd wreck the black bird sculpture."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 58 36 0 1) ; "You'd better not; you'd wreck the black bird sculpture."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theCloth of NumInvItem
	(properties
		noun 35
		message 54
		mainView 905
		mainLoop 6
		mainCel 11
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 35 37 0 1) ; "It's small enough already."
				)
				(Print y: 165 addText: 35 37 0 1 0 0 16 init:) ; "It's small enough already."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 35 37 0 1) ; "It's small enough already."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 74 76 0 1) ; "Why do you have this burning desire to immolate your possessions?"
				)
				(Print y: 165 addText: 74 76 0 1 0 0 16 init:) ; "Why do you have this burning desire to immolate your possessions?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 74 76 0 1) ; "Why do you have this burning desire to immolate your possessions?"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theChicken of NumInvItem
	(properties
		noun 36
		message 55
		mainView 905
		mainLoop 4
		mainCel 2
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(37 ; theThrowdagger
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 36 37 0 1) ; "Hey! No chicken sacrifices (even rubber ones) in this game!"
				)
				(Print y: 165 addText: 36 37 0 1 0 0 16 init:) ; "Hey! No chicken sacrifices (even rubber ones) in this game!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 36 37 0 1) ; "Hey! No chicken sacrifices (even rubber ones) in this game!"
				)
			)
			(45 ; theCorn
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 36 45 0 1) ; "Rubber chickens don't eat much."
				)
				(Print y: 165 addText: 36 45 0 1 0 0 16 init:) ; "Rubber chickens don't eat much."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 36 45 0 1) ; "Rubber chickens don't eat much."
				)
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 36 76 0 1) ; "Phew! Burning rubber smells awful!"
				)
				(Print y: 165 addText: 36 76 0 1 0 0 16 init:) ; "Phew! Burning rubber smells awful!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 36 76 0 1) ; "Phew! Burning rubber smells awful!"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

