/*
static uiSpinbox *spinbox
static uiSlider *slider
static uiProgressBar *pbar

#define CHANGED(what) \
	static void on ## what ## Changed(ui ## what *this, void *data) \
	{ \
		int value \
		printf("on %s changed\n", #what) \
		value = ui ## what ## Value(this) \
		uiSpinboxSetValue(spinbox, value) \
		uiSliderSetValue(slider, value) \
		uiProgressBarSetValue(pbar, value) \
	}
CHANGED(Spinbox)
CHANGED(Slider)

#define SETTOO(what, name, n) \
	static void set ## what ## Too ## name(uiButton *this, void *data) \
	{ \
		ui ## what ## SetValue(ui ## what(data), n) \
	}
SETTOO(Spinbox, Low, -80)
SETTOO(Spinbox, High, 80)
SETTOO(Slider, Low, -80)
SETTOO(Slider, High, 80)

static uiCombobox *cbox
static uiEditableCombobox *editable
static uiRadioButtons *rb

static void appendCBRB(uiButton *b, void *data)
{
	uiComboboxAppend(cbox, "New Item")
	uiEditableComboboxAppend(editable, "New Item")
	uiRadioButtonsAppend(rb, "New Item")
}

static void onCBChanged(uiCombobox *c, void *data)
{
	printf("%s combobox changed to %d\n",
		(char *) data,
		(int) uiComboboxSelected(c))
	uiEditableComboboxSetText(editable, "changed")
}

static void onECBChanged(uiEditableCombobox *c, void *data)
{
	char *t

	t = uiEditableComboboxText(c)
	printf("%s combobox changed to %s\n",
		(char *) data,
		t)
	uiFreeText(t)
}

static void onRBSelected(uiRadioButtons *r, void *data)
{
	printf("radio buttons %d\n", uiRadioButtonsSelected(r))
}

static void selectSecond(uiButton *b, void *data)
{
	// TODO combobox, editable
	uiRadioButtonsSetSelected(rb, 1)
}

static void selectNone(uiButton *b, void *data)
{
	// TODO combobox, editable
	uiRadioButtonsSetSelected(rb, -1)
}

uiBox *makePage4(void)
{
	uiBox *page4
	uiBox *hbox
	uiSpinbox *xsb
	uiButton *b
	uiSlider *xsl

	page4 = newVerticalBox()

	spinbox = uiNewSpinbox(0, 100)
	uiSpinboxOnChanged(spinbox, onSpinboxChanged, NULL)
	uiBoxAppend(page4, spinbox?.reinterpret(), 0)

	slider = uiNewSlider(0, 100)
	uiSliderOnChanged(slider, onSliderChanged, NULL)
	uiBoxAppend(page4, slider?.reinterpret(), 0)

	pbar = uiNewProgressBar()
	uiBoxAppend(page4, pbar?.reinterpret(), 0)

	uiBoxAppend(page4, uiNewHorizontalSeparator(?.reinterpret()), 0)

	hbox = newHorizontalBox()
	xsb = uiNewSpinbox(-40, 40)
	uiBoxAppend(hbox, xsb?.reinterpret(), 0)
	b = uiNewButton("Bad Low")
	uiButtonOnClicked(b, setSpinboxTooLow, xsb)
	uiBoxAppend(hbox, b?.reinterpret(), 0)
	b = uiNewButton("Bad High")
	uiButtonOnClicked(b, setSpinboxTooHigh, xsb)
	uiBoxAppend(hbox, b?.reinterpret(), 0)
	uiBoxAppend(page4, hbox?.reinterpret(), 0)

	hbox = newHorizontalBox()
	xsl = uiNewSlider(-40, 40)
	uiBoxAppend(hbox, xsl?.reinterpret(), 0)
	b = uiNewButton("Bad Low")
	uiButtonOnClicked(b, setSliderTooLow, xsl)
	uiBoxAppend(hbox, b?.reinterpret(), 0)
	b = uiNewButton("Bad High")
	uiButtonOnClicked(b, setSliderTooHigh, xsl)
	uiBoxAppend(hbox, b?.reinterpret(), 0)
	uiBoxAppend(page4, hbox?.reinterpret(), 0)

	uiBoxAppend(page4, uiNewHorizontalSeparator(?.reinterpret()), 0)

	cbox = uiNewCombobox()
	uiComboboxAppend(cbox, "Item 1")
	uiComboboxAppend(cbox, "Item 2")
	uiComboboxAppend(cbox, "Item 3")
	uiComboboxOnSelected(cbox, onCBChanged, "noneditable")
	uiBoxAppend(page4, cbox?.reinterpret(), 0)

	editable = uiNewEditableCombobox()
	uiEditableComboboxAppend(editable, "Editable Item 1")
	uiEditableComboboxAppend(editable, "Editable Item 2")
	uiEditableComboboxAppend(editable, "Editable Item 3")
	uiEditableComboboxOnChanged(editable, onECBChanged, "editable")
	uiBoxAppend(page4, editable?.reinterpret(), 0)

	rb = uiNewRadioButtons()
	uiRadioButtonsAppend(rb, "Item 1")
	uiRadioButtonsAppend(rb, "Item 2")
	uiRadioButtonsAppend(rb, "Item 3")
	uiRadioButtonsOnSelected(rb, onRBSelected, NULL)
	uiBoxAppend(page4, rb?.reinterpret(), 0)

	hbox = newHorizontalBox()
	b = uiNewButton("Append")
	uiButtonOnClicked(b, appendCBRB, NULL)
	uiBoxAppend(hbox, b?.reinterpret(), 0)
	b = uiNewButton("Second")
	uiButtonOnClicked(b, selectSecond, NULL)
	uiBoxAppend(hbox, b?.reinterpret(), 0)
	b = uiNewButton("None")
	uiButtonOnClicked(b, selectNone, NULL)
	uiBoxAppend(hbox, b?.reinterpret(), 0)
	uiBoxAppend(page4, hbox?.reinterpret(), 0)

	uiBoxAppend(page4, uiNewHorizontalSeparator(?.reinterpret()), 0)

	uiBoxAppend(page4, uiNewDateTimePicker(?.reinterpret()), 0)
	uiBoxAppend(page4, uiNewDatePicker(?.reinterpret()), 0)
	uiBoxAppend(page4, uiNewTimePicker(?.reinterpret()), 0)

	return page4
}
*/