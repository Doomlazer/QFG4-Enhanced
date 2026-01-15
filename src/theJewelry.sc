;;; Sierra Script 1.0 - (do not remove this comment)
;;; Decompiled by sluicebox
(script# 35)
(include sci.sh)
(use Main)
(use GloryIconItem)
(use Str)
(use Print)

(public
	theJewelry 0
	theKnob 1
	theStaff 2
	theBonsai 3
	theHammer 4
	theStake 5
	theBag 6
	theBoneRit 7
	theBloodRit 8
	theBreathRit 9
	theSenseRit 10
	theHeartRit 11
	theFlowers 12
	theWillowisp 13
	theLocket 14
	theStatue 15
	theTorch 16
	theAmulet 17
	theHair 18
	theBroom 19
)

(local
	local0
)

(procedure (localproc_0 &tmp temp0)
	(gTheIconBar curInvIcon: 0 advanceCurIcon:)
	(gTheIconBar disableIcon: (gTheIconBar at: 6))
	(= temp0 (ScriptID 36 1)) ; invItem
	(temp0 signal: (| (temp0 signal:) $0008))
	(DeleteScreenItem temp0)
)

(instance theJewelry of NumInvItem
	(properties
		noun 70
		message 77
		mainView 905
		mainLoop 8
		mainCel 8
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 70 1 0 1 (temp0 data:)) ; "Jewelry"
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
						(DoAudio audPLAY 16 70 1 0 2) ; "This fine jewelry is undoubtedly very valuable."
					)
					(Print y: 165 addText: 70 1 0 2 0 0 16 init:) ; "This fine jewelry is undoubtedly very valuable."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 70 1 0 2) ; "This fine jewelry is undoubtedly very valuable."
					)
				else
					(Message msgGET 16 70 1 0 1 (temp0 data:)) ; "Jewelry"
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

(instance theKnob of NumInvItem
	(properties
		noun 71
		message 78
		mainView 905
		mainLoop 8
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 71 1 0 1 (temp0 data:)) ; "Safe Knob"
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
						(DoAudio audPLAY 16 71 1 0 2) ; "It's a smallish metal knob with an arrow on one side."
					)
					(Print y: 165 addText: 71 1 0 2 0 0 16 init:) ; "It's a smallish metal knob with an arrow on one side."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 71 1 0 2) ; "It's a smallish metal knob with an arrow on one side."
					)
				else
					(Message msgGET 16 71 1 0 1 (temp0 data:)) ; "Safe Knob"
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
					(DoAudio audPLAY 16 71 32 0 1) ; "You oil the knob so it will turn more easily."
				)
				(Print y: 165 addText: 71 32 0 1 0 0 16 init:) ; "You oil the knob so it will turn more easily."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 71 32 0 1) ; "You oil the knob so it will turn more easily."
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

(instance theStaff of NumInvItem
	(properties
		noun 17
		message 157
		mainView 905
		mainLoop 6
		mainCel 12
		value 5
	)

	(method (select &tmp temp0)
		(if (and (= temp0 (super select: &rest)) (== gCurRoomNum 730))
			(SetFlag 360)
			(return 1)
		else
			(return temp0)
		)
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 17 1 0 1 (temp0 data:)) ; "Erana's Staff"
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
						(DoAudio audPLAY 16 17 1 0 2) ; "You have the legendary Staff of the Archmage Erana. It also makes a very nice walking stick."
					)
					(Print y: 165 addText: 17 1 0 2 0 0 16 init:) ; "You have the legendary Staff of the Archmage Erana. It also makes a very nice walking stick."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 17 1 0 2) ; "You have the legendary Staff of the Archmage Erana. It also makes a very nice walking stick."
					)
				else
					(Message msgGET 16 17 1 0 1 (temp0 data:)) ; "Erana's Staff"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(36 ; theSword
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 17 37 0 1) ; "You don't need to sharpen Erana's Staff; it will take care of that itself should it feel the need."
				)
				(Print y: 165 addText: 17 37 0 1 0 0 16 init:) ; "You don't need to sharpen Erana's Staff; it will take care of that itself should it feel the need."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 17 37 0 1) ; "You don't need to sharpen Erana's Staff; it will take care of that itself should it feel the need."
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
					(DoAudio audPLAY 16 17 37 0 1) ; "You don't need to sharpen Erana's Staff; it will take care of that itself should it feel the need."
				)
				(Print y: 165 addText: 17 37 0 1 0 0 16 init:) ; "You don't need to sharpen Erana's Staff; it will take care of that itself should it feel the need."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 17 37 0 1) ; "You don't need to sharpen Erana's Staff; it will take care of that itself should it feel the need."
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
					(DoAudio audPLAY 16 17 76 0 1) ; "Hey, have some respect for Erana's Staff!"
				)
				(Print y: 165 addText: 17 76 0 1 0 0 16 init:) ; "Hey, have some respect for Erana's Staff!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 17 76 0 1) ; "Hey, have some respect for Erana's Staff!"
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

(instance theBonsai of NumInvItem
	(properties
		noun 18
		message 14
		mainView 905
		mainLoop 8
		mainCel 6
		value 5
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 18 1 0 1) ; "Bonsai Bush"
					)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 18 1 0 1 (temp0 data:)) ; "Bonsai Bush"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(DoAudio audSTOP 16 18 1 0 1) ; "Bonsai Bush"
						(DoAudio audPLAY 16 18 1 0 2) ; "This bush was obviously carefully and lovingly cared for (until someone relocated it to the goo). It looks delicate and strong at the same time."
					)
					(Print y: 165 addText: 18 1 0 2 0 0 16 init:) ; "This bush was obviously carefully and lovingly cared for (until someone relocated it to the goo). It looks delicate and strong at the same time."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 18 1 0 2) ; "This bush was obviously carefully and lovingly cared for (until someone relocated it to the goo). It looks delicate and strong at the same time."
					)
				else
					(Message msgGET 16 18 1 0 1 (temp0 data:)) ; "Bonsai Bush"
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
					(DoAudio audPLAY 16 18 25 0 1) ; "You pour a bit of water on the bonsai bush's roots. You suspect, however, that water would do it more good once it's been replanted."
				)
				(Print y: 165 addText: 18 25 0 1 0 0 16 init:) ; "You pour a bit of water on the bonsai bush's roots. You suspect, however, that water would do it more good once it's been replanted."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 18 25 0 1) ; "You pour a bit of water on the bonsai bush's roots. You suspect, however, that water would do it more good once it's been replanted."
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
					(DoAudio audPLAY 16 18 37 0 1) ; "You'd better leave that to the bonsai experts."
				)
				(Print y: 165 addText: 18 37 0 1 0 0 16 init:) ; "You'd better leave that to the bonsai experts."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 18 37 0 1) ; "You'd better leave that to the bonsai experts."
				)
			)
			(48 ; theBerries
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 18 48 0 1) ; "Having second thoughts about plucking those berries? Well, they won't grow on the bonsai bush."
				)
				(Print y: 165 addText: 18 48 0 1 0 0 16 init:) ; "Having second thoughts about plucking those berries? Well, they won't grow on the bonsai bush."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 18 48 0 1) ; "Having second thoughts about plucking those berries? Well, they won't grow on the bonsai bush."
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
					(DoAudio audPLAY 16 18 76 0 1) ; "What do you think this is -- firewood?"
				)
				(Print y: 165 addText: 18 76 0 1 0 0 16 init:) ; "What do you think this is -- firewood?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 18 76 0 1) ; "What do you think this is -- firewood?"
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

(instance theHammer of NumInvItem
	(properties
		noun 72
		message 171
		mainView 905
		mainLoop 4
		mainCel 6
		value 5
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 72 1 0 1) ; "Iron Hammer"
					)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 72 1 0 1 (temp0 data:)) ; "Iron Hammer"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(DoAudio audSTOP 16 72 1 0 1) ; "Iron Hammer"
						(DoAudio audPLAY 16 72 1 0 2) ; "The heavy iron hammer gives you a stake in the future."
					)
					(Print y: 165 addText: 72 1 0 2 0 0 16 init:) ; "The heavy iron hammer gives you a stake in the future."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 72 1 0 2) ; "The heavy iron hammer gives you a stake in the future."
					)
				else
					(Message msgGET 16 72 1 0 1 (temp0 data:)) ; "Iron Hammer"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(170 ; theStake
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 72 170 0 1) ; "Isn't that a little backwards?"
				)
				(Print y: 165 addText: 72 170 0 1 0 0 16 init:) ; "Isn't that a little backwards?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 72 170 0 1) ; "Isn't that a little backwards?"
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

(instance theStake of NumInvItem
	(properties
		noun 73
		message 170
		mainView 905
		mainLoop 4
		mainCel 7
		value 5
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 73 1 0 1 (temp0 data:)) ; "Stake"
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
						(DoAudio audPLAY 16 73 1 0 2) ; "This is your basic wooden stake suitable for erecting tents and slaying Vampires. You don't have a tent."
					)
					(Print y: 165 addText: 73 1 0 2 0 0 16 init:) ; "This is your basic wooden stake suitable for erecting tents and slaying Vampires. You don't have a tent."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 73 1 0 2) ; "This is your basic wooden stake suitable for erecting tents and slaying Vampires. You don't have a tent."
					)
				else
					(Message msgGET 16 73 1 0 1 (temp0 data:)) ; "Stake"
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
					(DoAudio audPLAY 16 73 76 0 1) ; "One burning torch is enough for now."
				)
				(Print y: 165 addText: 73 76 0 1 0 0 16 init:) ; "One burning torch is enough for now."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 73 76 0 1) ; "One burning torch is enough for now."
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
					(DoAudio audPLAY 16 73 171 0 1) ; "You pound the stake with your hammer, making a nice solid "Thunk!" sound."
				)
				(Print y: 165 addText: 73 171 0 1 0 0 16 init:) ; "You pound the stake with your hammer, making a nice solid "Thunk!" sound."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 73 171 0 1) ; "You pound the stake with your hammer, making a nice solid "Thunk!" sound."
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

(instance theBag of NumInvItem
	(properties
		noun 74
		message 13
		mainView 905
		mainLoop 2
		value 5
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(if (IsFlag 400)
						(= local0 (gGlory masterVolume:))
						(if (>= local0 6)
							(gGlory masterVolume: (- local0 6))
						else
							(gGlory masterVolume: 1)
						)
						(DoAudio audPLAY 16 74 1 0 1) ; "Shopping Bag"
					)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 74 1 0 1 (temp0 data:)) ; "Shopping Bag"
					(if (> amount 1)
						(Message msgGET 16 0 theVerb 1 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) amount value)
					else
						(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
						(temp1 format: (temp1 data:) (temp0 data:) value)
					)
					(Print addText: (temp1 data:) y: 165 init:)
					(if (IsFlag 400)
						(DoAudio audSTOP 16 74 1 0 1) ; "Shopping Bag"
						(DoAudio audPLAY 16 74 1 0 2) ; "This reusable cloth shopping bag reduces waste and makes a handy container. (Bagging big game with it is not recommended, however.)"
					)
					(Print y: 165 addText: 74 1 0 2 0 0 16 init:) ; "This reusable cloth shopping bag reduces waste and makes a handy container. (Bagging big game with it is not recommended, however.)"
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 74 1 0 2) ; "This reusable cloth shopping bag reduces waste and makes a handy container. (Bagging big game with it is not recommended, however.)"
					)
				else
					(Message msgGET 16 74 1 0 1 (temp0 data:)) ; "Shopping Bag"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(23 ; theCandy
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 74 23 0 1) ; "Trick or Treat?"
				)
				(Print y: 165 addText: 74 23 0 1 0 0 16 init:) ; "Trick or Treat?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 74 23 0 1) ; "Trick or Treat?"
				)
			)
			(36 ; theSword
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 74 37 0 1) ; "The bag won't be very useful if you cut it up."
				)
				(Print y: 165 addText: 74 37 0 1 0 0 16 init:) ; "The bag won't be very useful if you cut it up."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 74 37 0 1) ; "The bag won't be very useful if you cut it up."
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
					(DoAudio audPLAY 16 74 37 0 1) ; "The bag won't be very useful if you cut it up."
				)
				(Print y: 165 addText: 74 37 0 1 0 0 16 init:) ; "The bag won't be very useful if you cut it up."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 74 37 0 1) ; "The bag won't be very useful if you cut it up."
				)
			)
			(66 ; theStatue
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 74 66 0 1) ; "The statuette is already in the bag (fortunately for you)."
				)
				(Print y: 165 addText: 74 66 0 1 0 0 16 init:) ; "The statuette is already in the bag (fortunately for you)."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 74 66 0 1) ; "The statuette is already in the bag (fortunately for you)."
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

(instance theBoneRit of NumInvItem
	(properties
		noun 50
		message 67
		mainView 905
		mainLoop 2
		mainCel 14
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(1 ; Look
				(super doVerb: theVerb)
				(if (IsFlag 452)
					(if (== gCurRoomNum 770)
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						)
						(Print y: 165 addText: 52 1 41 1 0 0 16 init:) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						(if (IsFlag 400)
							(gGlory masterVolume: local0)
							(DoAudio audSTOP 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						)
					else
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 50 1 44 1) ; "You can almost read the words of the Bone Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						)
						(Print y: 165 addText: 50 1 44 1 0 0 16 init:) ; "You can almost read the words of the Bone Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						(if (IsFlag 400)
							(gGlory masterVolume: local0)
							(DoAudio audSTOP 16 50 1 44 1) ; "You can almost read the words of the Bone Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						)
					)
				)
			)
			(46 ; thePiepan
				(Print y: 165 addText: 0 0 11 1 0 0 16 init:) ; "Nothing much happens."
			)
			(76 ; theTorch
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
				(Print y: 165 addText: 52 76 0 1 0 0 16 init:) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theBloodRit of NumInvItem
	(properties
		noun 52
		message 69
		mainView 905
		mainLoop 2
		mainCel 14
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(1 ; Look
				(super doVerb: theVerb)
				(if (IsFlag 452)
					(if (== gCurRoomNum 740)
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						)
						(Print y: 165 addText: 52 1 41 1 0 0 16 init:) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						(if (IsFlag 400)
							(gGlory masterVolume: local0)
							(DoAudio audSTOP 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						)
					else
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 52 1 42 1) ; "You can almost read the words of the Blood Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						)
						(Print y: 165 addText: 52 1 42 1 0 0 16 init:) ; "You can almost read the words of the Blood Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						(if (IsFlag 400)
							(gGlory masterVolume: local0)
							(DoAudio audSTOP 16 52 1 42 1) ; "You can almost read the words of the Blood Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						)
					)
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
					(DoAudio audPLAY 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
				(Print y: 165 addText: 52 76 0 1 0 0 16 init:) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theBreathRit of NumInvItem
	(properties
		noun 76
		message 70
		mainView 905
		mainLoop 2
		mainCel 14
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(1 ; Look
				(super doVerb: theVerb)
				(if (IsFlag 452)
					(if (== gCurRoomNum 750)
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						)
						(Print y: 165 addText: 52 1 41 1 0 0 16 init:) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						(if (IsFlag 400)
							(gGlory masterVolume: local0)
							(DoAudio audSTOP 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
						)
					else
						(if (IsFlag 400)
							(= local0 (gGlory masterVolume:))
							(if (>= local0 6)
								(gGlory masterVolume: (- local0 6))
							else
								(gGlory masterVolume: 1)
							)
							(DoAudio audPLAY 16 76 1 40 1) ; "You can almost read the words of the Breath Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						)
						(Print y: 165 addText: 76 1 40 1 0 0 16 init:) ; "You can almost read the words of the Breath Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						(if (IsFlag 400)
							(gGlory masterVolume: local0)
							(DoAudio audSTOP 16 76 1 40 1) ; "You can almost read the words of the Breath Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
						)
					)
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
					(DoAudio audPLAY 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
				(Print y: 165 addText: 52 76 0 1 0 0 16 init:) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theSenseRit of NumInvItem
	(properties
		noun 56
		message 72
		mainView 905
		mainLoop 2
		mainCel 14
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 56 1 0 1 (temp0 data:)) ; "Sense Ritual"
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
						(DoAudio audPLAY 16 56 1 0 2) ; "This scroll contains the symbol of the Senses at the top. The rest is written in characters that seem to shimmer and shift so that you can't focus on them."
					)
					(Print y: 165 addText: 56 1 0 2 0 0 16 init:) ; "This scroll contains the symbol of the Senses at the top. The rest is written in characters that seem to shimmer and shift so that you can't focus on them."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 56 1 0 2) ; "This scroll contains the symbol of the Senses at the top. The rest is written in characters that seem to shimmer and shift so that you can't focus on them."
					)
					(if (IsFlag 452)
						(if (== gCurRoomNum 760)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
							)
							(Print y: 165 addText: 52 1 41 1 0 0 16 init:) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
							)
						else
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 56 1 48 1) ; "You can almost read the words of the Sense Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
							)
							(Print y: 165 addText: 56 1 48 1 0 0 16 init:) ; "You can almost read the words of the Sense Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 56 1 48 1) ; "You can almost read the words of the Sense Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
							)
						)
					)
				else
					(Message msgGET 16 56 1 0 1 (temp0 data:)) ; "Sense Ritual"
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
					(DoAudio audPLAY 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
				(Print y: 165 addText: 52 76 0 1 0 0 16 init:) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
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

(instance theHeartRit of NumInvItem
	(properties
		noun 66
		message 74
		mainView 905
		mainLoop 2
		mainCel 14
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 66 1 0 1 (temp0 data:)) ; "Heart Ritual"
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
						(DoAudio audPLAY 16 66 1 0 2) ; "This scroll contains the symbol of a Heart at the top. When you look away, you can almost swear you see it beating. The rest is written in characters that seem to shimmer and shift so that you can't focus on them."
					)
					(Print y: 165 addText: 66 1 0 2 0 0 16 init:) ; "This scroll contains the symbol of a Heart at the top. When you look away, you can almost swear you see it beating. The rest is written in characters that seem to shimmer and shift so that you can't focus on them."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 66 1 0 2) ; "This scroll contains the symbol of a Heart at the top. When you look away, you can almost swear you see it beating. The rest is written in characters that seem to shimmer and shift so that you can't focus on them."
					)
					(if (IsFlag 452)
						(if (== gCurRoomNum 720)
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
							)
							(Print y: 165 addText: 52 1 41 1 0 0 16 init:) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 52 1 41 1) ; "At last the words of the Ritual have become clear! Now you must use the Ritual on the dark altar."
							)
						else
							(if (IsFlag 400)
								(= local0 (gGlory masterVolume:))
								(if (>= local0 6)
									(gGlory masterVolume: (- local0 6))
								else
									(gGlory masterVolume: 1)
								)
								(DoAudio audPLAY 16 66 1 47 1) ; "You can almost read the words of the Heart Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
							)
							(Print y: 165 addText: 66 1 47 1 0 0 16 init:) ; "You can almost read the words of the Heart Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
							(if (IsFlag 400)
								(gGlory masterVolume: local0)
								(DoAudio audSTOP 16 66 1 47 1) ; "You can almost read the words of the Heart Ritual now, but you still can't quite manage it. The closer you move to the Altar, the clearer the words become."
							)
						)
					)
				else
					(Message msgGET 16 66 1 0 1 (temp0 data:)) ; "Heart Ritual"
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
					(DoAudio audPLAY 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				)
				(Print y: 165 addText: 52 76 0 1 0 0 16 init:) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 52 76 0 1) ; "Your torch has no effect on the Ritual; the paper is evidently protected by magic."
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

(instance theFlowers of NumInvItem
	(properties
		noun 41
		message 59
		mainView 905
		mainLoop 4
		mainCel 14
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
					(DoAudio audPLAY 16 41 25 0 1) ; "Watering the cut flowers doesn't help much."
				)
				(Print y: 165 addText: 41 25 0 1 0 0 16 init:) ; "Watering the cut flowers doesn't help much."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 41 25 0 1) ; "Watering the cut flowers doesn't help much."
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theWillowisp of NumInvItem
	(properties
		noun 42
		message 60
		mainView 905
		mainLoop 4
		mainCel 10
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 42 1 0 1 (temp0 data:)) ; "Will o' Wisps"
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
						(DoAudio audPLAY 16 42 1 0 2) ; "You've managed to capture a few of the delicate, glowing Will o' Wisps in this flask."
					)
					(Print y: 165 addText: 42 1 0 2 0 0 16 init:) ; "You've managed to capture a few of the delicate, glowing Will o' Wisps in this flask."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 42 1 0 2) ; "You've managed to capture a few of the delicate, glowing Will o' Wisps in this flask."
					)
				else
					(Message msgGET 16 42 1 0 1 (temp0 data:)) ; "Will o' Wisps"
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
					(DoAudio audPLAY 16 42 25 0 1) ; "It's not a plant, you know."
				)
				(Print y: 165 addText: 42 25 0 1 0 0 16 init:) ; "It's not a plant, you know."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 42 25 0 1) ; "It's not a plant, you know."
				)
			)
			(36 ; theSword
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 42 37 0 1) ; "Besides violating the Quest for Glory Cruelty to Animals pact, you can't do anything to the Will o' Wisps with your weapon -- it passes harmlessly through the ethereal creatures."
				)
				(Print y: 165 addText: 42 37 0 1 0 0 16 init:) ; "Besides violating the Quest for Glory Cruelty to Animals pact, you can't do anything to the Will o' Wisps with your weapon -- it passes harmlessly through the ethereal creatures."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 42 37 0 1) ; "Besides violating the Quest for Glory Cruelty to Animals pact, you can't do anything to the Will o' Wisps with your weapon -- it passes harmlessly through the ethereal creatures."
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
					(DoAudio audPLAY 16 42 37 0 1) ; "Besides violating the Quest for Glory Cruelty to Animals pact, you can't do anything to the Will o' Wisps with your weapon -- it passes harmlessly through the ethereal creatures."
				)
				(Print y: 165 addText: 42 37 0 1 0 0 16 init:) ; "Besides violating the Quest for Glory Cruelty to Animals pact, you can't do anything to the Will o' Wisps with your weapon -- it passes harmlessly through the ethereal creatures."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 42 37 0 1) ; "Besides violating the Quest for Glory Cruelty to Animals pact, you can't do anything to the Will o' Wisps with your weapon -- it passes harmlessly through the ethereal creatures."
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
					(DoAudio audPLAY 16 42 56 0 1) ; "The Amulet protects you against Undead, but doesn't hurt them. Since the Will o' Wisps are not trying to harm you, the Amulet has no effect."
				)
				(Print y: 165 addText: 42 56 0 1 0 0 16 init:) ; "The Amulet protects you against Undead, but doesn't hurt them. Since the Will o' Wisps are not trying to harm you, the Amulet has no effect."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 42 56 0 1) ; "The Amulet protects you against Undead, but doesn't hurt them. Since the Will o' Wisps are not trying to harm you, the Amulet has no effect."
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
					(DoAudio audPLAY 16 42 76 0 1) ; "The Will o' Wisps make their own light. They don't need any help from you."
				)
				(Print y: 165 addText: 42 76 0 1 0 0 16 init:) ; "The Will o' Wisps make their own light. They don't need any help from you."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 42 76 0 1) ; "The Will o' Wisps make their own light. They don't need any help from you."
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

(instance theLocket of NumInvItem
	(properties
		noun 46
		message 63
		mainView 905
		mainLoop 8
		mainCel 2
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 46 1 0 1 (temp0 data:)) ; "Locket"
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
						(DoAudio audPLAY 16 46 1 0 2) ; "Inside the locket you find the portrait of a lovely young woman. The hinges are worn -- the old man has obviously looked at this frequently."
					)
					(Print y: 165 addText: 46 1 0 2 0 0 16 init:) ; "Inside the locket you find the portrait of a lovely young woman. The hinges are worn -- the old man has obviously looked at this frequently."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 46 1 0 2) ; "Inside the locket you find the portrait of a lovely young woman. The hinges are worn -- the old man has obviously looked at this frequently."
					)
				else
					(Message msgGET 16 46 1 0 1 (temp0 data:)) ; "Locket"
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

(instance theStatue of NumInvItem
	(properties
		noun 49
		message 66
		mainView 905
		mainLoop 10
		mainCel 5
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 49 1 0 1 (temp0 data:)) ; "Statue"
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
						(DoAudio audPLAY 16 49 1 0 2) ; "Carefully wrapped in a shopping bag is the grotesque sculpture of a horrible, squid-like monster."
					)
					(Print y: 165 addText: 49 1 0 2 0 0 16 init:) ; "Carefully wrapped in a shopping bag is the grotesque sculpture of a horrible, squid-like monster."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 49 1 0 2) ; "Carefully wrapped in a shopping bag is the grotesque sculpture of a horrible, squid-like monster."
					)
				else
					(Message msgGET 16 49 1 0 1 (temp0 data:)) ; "Statue"
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

(instance theTorch of NumInvItem
	(properties
		noun 69
		message 76
		mainView 905
		mainLoop 8
		mainCel 9
		value 2
	)

	(method (doVerb theVerb &tmp temp0 temp1 temp2)
		(= temp0 (Str new:))
		(= temp1 (Str new:))
		(switch theVerb
			(1 ; Look
				(if (== owner gEgo)
					(Message msgGET 16 0 theVerb 2 1 (temp1 data:))
					(Message msgGET 16 69 1 0 1 (temp0 data:)) ; "Magical Torch"
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
						(DoAudio audPLAY 16 69 1 0 2) ; "You light and extinguish this torch in the usual way, but it's obviously magical since it never seems to burn down."
					)
					(Print addText: 69 1 0 2 0 0 16 y: 165 init:) ; "You light and extinguish this torch in the usual way, but it's obviously magical since it never seems to burn down."
					(if (IsFlag 400)
						(gGlory masterVolume: local0)
						(DoAudio audSTOP 16 69 1 0 2) ; "You light and extinguish this torch in the usual way, but it's obviously magical since it never seems to burn down."
					)
				else
					(Message msgGET 16 69 1 0 1 (temp0 data:)) ; "Magical Torch"
					(Message msgGET 16 0 theVerb 4 1 (temp1 data:))
					(temp1 format: (temp1 data:) (temp0 data:) chestAmout)
					(Print addText: (temp1 data:) y: 165 init:)
				)
			)
			(39 ; theFlint
				(if (gEgo has: 5) ; theThrowdagger
					(theTorch cel: 10 state: 1)
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
					((= temp2 (ScriptID 36 1)) cel: 10 show:) ; invItem
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
		(temp0 dispose:)
		(temp1 dispose:)
	)
)

(instance theAmulet of NumInvItem
	(properties
		noun 45
		message 56
		mainView 905
		mainLoop 4
		mainCel 3
		value 10
	)

	(method (doVerb theVerb)
		(switch theVerb
			(39 ; theFlint
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 45 39 0 1) ; "The Undead Amulet isn't made of iron."
				)
				(Print y: 165 addText: 45 39 0 1 0 0 16 init:) ; "The Undead Amulet isn't made of iron."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 45 39 0 1) ; "The Undead Amulet isn't made of iron."
				)
			)
			(43 ; theDarksign
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
			(47 ; theBones
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
			(60 ; theWillowisp
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 45 60 0 1) ; "The Will o' Wisps aren't affected by the Undead Amulet."
				)
				(Print y: 165 addText: 45 60 0 1 0 0 16 init:) ; "The Will o' Wisps aren't affected by the Undead Amulet."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 45 60 0 1) ; "The Will o' Wisps aren't affected by the Undead Amulet."
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
					(DoAudio audPLAY 16 45 76 0 1) ; "Careful! You don't want to melt the amulet!"
				)
				(Print y: 165 addText: 45 76 0 1 0 0 16 init:) ; "Careful! You don't want to melt the amulet!"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 45 76 0 1) ; "Careful! You don't want to melt the amulet!"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

(instance theHair of NumInvItem
	(properties
		noun 37
		message 57
		mainView 905
		mainLoop 10
		mainCel 3
		value 2
	)
)

(instance theBroom of NumInvItem
	(properties
		noun 39
		message 58
		mainView 905
		mainLoop 10
		value 2
	)

	(method (doVerb theVerb)
		(switch theVerb
			(1 ; Look
				(super doVerb: theVerb)
				(if state
					(Print y: 165 addText: noun theVerb 31 2 0 0 16 init:) ; "You've woven some of the Rusalka's hair into the straw of the hand broom. It now feels somehow heavier and stronger than its appearance would suggest."
				)
			)
			(54 ; theCloth
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 39 54 0 1) ; "Trying to surrender?"
				)
				(Print y: 165 addText: 39 54 0 1 0 0 16 init:) ; "Trying to surrender?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 39 54 0 1) ; "Trying to surrender?"
				)
			)
			(57 ; theHair
				(if
					(and
						(== (gTheIconBar curInvIcon:) theHair)
						(== (theHair amount:) 1)
					)
					(localproc_0)
				)
				(if (== state 0)
					(+= cel (= state 1))
				)
				(theHair amount: (- (theHair amount:) 1))
				(+= value (theHair value:))
				(if (< (theHair amount:) 1)
					(theHair signal: 4)
					(DeleteScreenItem theHair)
				)
				(gInventory drawInvItems:)
				(gInventory advanceCurIcon:)
				(FrameOut)
				(if (IsFlag 400)
					(= local0 (gGlory masterVolume:))
					(if (>= local0 6)
						(gGlory masterVolume: (- local0 6))
					else
						(gGlory masterVolume: 1)
					)
					(DoAudio audPLAY 16 39 57 0 1) ; "You interweave the Rusalka's hair with the straw on the broom."
				)
				(Print y: 165 addText: noun 57 0 0 0 0 16 init:) ; "You interweave the Rusalka's hair with the straw on the broom."
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 39 57 0 1) ; "You interweave the Rusalka's hair with the straw on the broom."
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
					(DoAudio audPLAY 16 18 76 0 1) ; "What do you think this is -- firewood?"
				)
				(Print y: 165 addText: 18 76 0 1 0 0 16 init:) ; "What do you think this is -- firewood?"
				(if (IsFlag 400)
					(gGlory masterVolume: local0)
					(DoAudio audSTOP 16 18 76 0 1) ; "What do you think this is -- firewood?"
				)
			)
			(else
				(super doVerb: theVerb)
			)
		)
	)
)

