package X;

/* renamed from: X.0m5  reason: invalid class name and case insensitive filesystem */
public final class C12640m5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0Js $accessibilityScrollState;
    public final /* synthetic */ AnonymousClass0HW $collectionInfo;
    public final /* synthetic */ C22821Di $indexForKeyMapping;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ AnonymousClass1OS $scrollByAction;
    public final /* synthetic */ C22821Di $scrollToIndexAction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12640m5(AnonymousClass0HW r2, AnonymousClass0Js r3, C22821Di r4, C22821Di r5, AnonymousClass1OS r6, boolean z) {
        super(1);
        this.$indexForKeyMapping = r4;
        this.$isVertical = z;
        this.$accessibilityScrollState = r3;
        this.$scrollByAction = r6;
        this.$scrollToIndexAction = r5;
        this.$collectionInfo = r2;
    }

    public static final void A00(C16520sO r3, C22821Di r4) {
        r3.CHj(C03120Gr.A0J, new AnonymousClass0KP((String) null, r4));
    }

    public final void A02(C16520sO r3) {
        AnonymousClass0PS r0;
        r3.CHj(C03150Gu.A0E, true);
        r3.CHj(C03150Gu.A0A, this.$indexForKeyMapping);
        boolean z = this.$isVertical;
        AnonymousClass0Js r1 = this.$accessibilityScrollState;
        if (z) {
            r0 = C03150Gu.A0T;
        } else {
            r0 = C03150Gu.A08;
        }
        r3.CHj(r0, r1);
        AnonymousClass1OS r02 = this.$scrollByAction;
        if (r02 != null) {
            C05150Qq.A0E(r3, r02);
        }
        C22821Di r03 = this.$scrollToIndexAction;
        if (r03 != null) {
            A00(r3, r03);
        }
        r3.CHj(C03150Gu.A00, this.$collectionInfo);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A02((C16520sO) obj);
        return C27621Wu.A00;
    }
}
