package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1SB;
import X.AnonymousClass1VU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3TL;
import X.AnonymousClass49Z;
import X.AnonymousClass722;
import X.AnonymousClass7MX;
import X.AnonymousClass88B;
import X.C000200d;
import X.C107845ai;
import X.C117015z4;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C221618v;
import X.C23221Fe;
import X.C37101oy;
import X.C43021z7;
import X.C72473Md;
import X.C72483Me;
import X.C80753xv;
import X.C90014dO;
import X.C90534eE;
import X.C91014f0;
import X.C95924n1;
import X.C99734tN;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.Map;

public class GroupProfileEmojiEditor extends AnonymousClass1FY implements C23221Fe {
    public static final Map A0N = new C99734tN(0);
    public Bitmap A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public BottomSheetBehavior A05;
    public KeyboardPopupLayout A06;
    public AnonymousClass1VU A07;
    public EmojiSearchKeyboardContainer A08;
    public ExpressionsTrayView A09;
    public AnonymousClass3TL A0A;
    public C95924n1 A0B;
    public AnonymousClass1SB A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public RecyclerView A0J;
    public AnonymousClass7MX A0K;
    public boolean A0L;
    public final int[] A0M;

    public GroupProfileEmojiEditor() {
        this(0);
        this.A0F = C221618v.A00(C37101oy.class);
        this.A0M = new int[]{2131886240, 2131886242, 2131886237, 2131886244, 2131886238, 2131886239, 2131886235, 2131886234, 2131886243, 2131886241, 2131886236};
    }

    private void A03() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166956);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131166955);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(2131166738);
        this.A0J.measure(0, 0);
        int measuredHeight = this.A0J.getMeasuredHeight();
        View view = this.A01;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C90534eE(this, dimensionPixelOffset, dimensionPixelOffset2, measuredHeight, dimensionPixelOffset3));
        }
    }

    public static void A0Q(GroupProfileEmojiEditor groupProfileEmojiEditor, int i, int i2) {
        int i3;
        BottomSheetBehavior bottomSheetBehavior = groupProfileEmojiEditor.A05;
        if (bottomSheetBehavior != null && (i3 = bottomSheetBehavior.A0J) != 5 && i3 != 2) {
            View view = groupProfileEmojiEditor.A02;
            if (view != null) {
                AnonymousClass3MX.A1F(view, i);
                groupProfileEmojiEditor.A02.requestLayout();
            }
            KeyboardPopupLayout keyboardPopupLayout = groupProfileEmojiEditor.A06;
            if (keyboardPopupLayout != null) {
                AnonymousClass3MX.A1F(keyboardPopupLayout, i2);
                groupProfileEmojiEditor.A06.requestLayout();
            }
        }
    }

    public void A2y() {
        if (!this.A0L) {
            this.A0L = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r1 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L2, r1, this, r1.A5A);
            this.A0G = C000200d.A00(A0L2.Aev);
            this.A0I = C000200d.A00(A0L2.AAP);
            this.A0C = (AnonymousClass1SB) A0L2.AAS.get();
            this.A0D = C000200d.A00(r1.A8m);
            this.A07 = AnonymousClass3MZ.A0s(A0L2);
            this.A0E = C000200d.A00(r1.A1c);
            this.A0B = (C95924n1) r1.ABu.get();
            this.A0H = C000200d.A00(r1.AHg);
        }
    }

    public void C0a(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0K.A02(pickerSearchDialogFragment);
    }

    public void onBackPressed() {
        C95924n1 r0 = this.A0B;
        if (r0 != null) {
            C80753xv r02 = r0.A06;
            if (r02 == null || !r02.A02()) {
                super.onBackPressed();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        BottomSheetBehavior bottomSheetBehavior;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer;
        super.onCreate(bundle);
        setContentView(2131625518);
        int[] intArray = getResources().getIntArray(2130903059);
        int[] intArray2 = getResources().getIntArray(2130903058);
        Object A0w = AnonymousClass000.A0w(A0N, getIntent().getIntExtra("emojiEditorProfileTarget", 1));
        if (A0w == null) {
            new C43021z7
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: CONSTRUCTOR  (r4v8 ? I:X.1z7) =  call: X.1z7.<init>():void type: CONSTRUCTOR in method: com.whatsapp.group.GroupProfileEmojiEditor.onCreate(android.os.Bundle):void, dex: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v8 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r10 = r17
                r0 = r18
                super.onCreate(r0)
                r0 = 2131625518(0x7f0e062e, float:1.8878246E38)
                r10.setContentView((int) r0)
                android.content.res.Resources r1 = r10.getResources()
                r0 = 2130903059(0x7f030013, float:1.7412925E38)
                int[] r12 = r1.getIntArray(r0)
                android.content.res.Resources r1 = r10.getResources()
                r0 = 2130903058(0x7f030012, float:1.7412923E38)
                int[] r13 = r1.getIntArray(r0)
                android.content.Intent r1 = r10.getIntent()
                java.lang.String r0 = "emojiEditorProfileTarget"
                r5 = 1
                int r1 = r1.getIntExtra(r0, r5)
                java.util.Map r0 = A0N
                java.lang.Object r4 = X.AnonymousClass000.A0w(r0, r1)
                if (r4 != 0) goto L_0x003b
                X.1z7 r4 = new X.1z7
                r4.<init>()
            L_0x003b:
                r1 = 12
                X.4gE r0 = new X.4gE
                r0.<init>(r10, r12, r1)
                X.1It r1 = new X.1It
                r1.<init>(r0, r10)
                java.lang.Class<X.3TL> r0 = X.AnonymousClass3TL.class
                X.1J2 r0 = r1.A00(r0)
                X.3TL r0 = (X.AnonymousClass3TL) r0
                r10.A0A = r0
                r0 = 2131433972(0x7f0b19f4, float:1.8489745E38)
                android.view.View r2 = r10.findViewById(r0)
                com.whatsapp.KeyboardPopupLayout r2 = (com.whatsapp.KeyboardPopupLayout) r2
                r10.A06 = r2
                r1 = 2130969438(0x7f04035e, float:1.7547558E38)
                r0 = 2131100423(0x7f060307, float:1.7813227E38)
                int r0 = X.AnonymousClass3Ma.A00(r10, r1, r0)
                r2.setKeyboardPopupBackgroundColor(r0)
                androidx.appcompat.widget.Toolbar r3 = X.AnonymousClass3Ma.A0F(r10)
                X.0vb r2 = r10.A00
                r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
                r1 = 2131101222(0x7f060626, float:1.7814848E38)
                android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r10, r0)
                android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A05(r10, r0, r1)
                X.3cP r0 = new X.3cP
                r0.<init>(r1, r2)
                r3.setNavigationIcon((android.graphics.drawable.Drawable) r0)
                X.C137506vZ.A00(r3)
                X.01n r1 = X.C72463Mc.A0S(r10, r3)
                r0 = 2131891127(0x7f1213b7, float:1.9416965E38)
                r1.A0M(r0)
                X.01n r0 = r10.getSupportActionBar()
                r0.A0Y(r5)
                X.01n r0 = r10.getSupportActionBar()
                r0.A0W(r5)
                r0 = 2131429197(0x7f0b074d, float:1.848006E38)
                android.view.View r1 = X.C110885hR.A0A(r10, r0)
                androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
                r10.A0J = r1
                X.3TL r11 = r10.A0A
                int[] r0 = r10.A0M
                X.3Wl r9 = new X.3Wl
                r14 = r0
                r9.<init>(r10, r11, r12, r13, r14)
                r1.setAdapter(r9)
                androidx.recyclerview.widget.RecyclerView r2 = r10.A0J
                r1 = 0
                androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
                r0.<init>(r10, r1, r1)
                r2.setLayoutManager(r0)
                r0 = 2131429666(0x7f0b0922, float:1.8481011E38)
                android.view.View r0 = X.C110885hR.A0A(r10, r0)
                r10.A01 = r0
                r0 = 2131433834(0x7f0b196a, float:1.8489465E38)
                android.view.View r0 = X.C110885hR.A0A(r10, r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r10.A04 = r0
                X.3TL r0 = r10.A0A
                X.1vp r3 = r0.A00
                r2 = 23
                X.4fm r0 = new X.4fm
                r0.<init>(r4, r10, r2)
                r3.A0A(r10, r0)
                X.1It r2 = X.AnonymousClass3MW.A0N(r10)
                java.lang.Class<com.whatsapp.group.KeyboardControllerViewModel> r0 = com.whatsapp.group.KeyboardControllerViewModel.class
                X.1J2 r0 = r2.A00(r0)
                com.whatsapp.group.KeyboardControllerViewModel r0 = (com.whatsapp.group.KeyboardControllerViewModel) r0
                X.0ve r4 = r10.A0E
                r3 = 3792(0xed0, float:5.314E-42)
                X.0vf r2 = X.C18040vf.A02
                boolean r2 = X.C18020vd.A05(r2, r4, r3)
                if (r2 == 0) goto L_0x01af
                r2 = 2131430746(0x7f0b0d5a, float:1.8483202E38)
                android.view.View r3 = X.C110885hR.A0A(r10, r2)
                com.whatsapp.expressionstray.ExpressionsTrayView r3 = (com.whatsapp.expressionstray.ExpressionsTrayView) r3
                r10.A09 = r3
                r2 = 10
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r8 = 2
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r5 = 0
                r6 = r5
                r3.A0G(r4, r5, r6, r7, r8)
                r2 = 2131430747(0x7f0b0d5b, float:1.8483204E38)
                android.view.View r2 = X.C110885hR.A0A(r10, r2)
                r10.A02 = r2
                r2 = 2131430735(0x7f0b0d4f, float:1.848318E38)
                android.view.View r2 = X.C110885hR.A0A(r10, r2)
                com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r2 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r2
                r10.A08 = r2
                com.whatsapp.expressionstray.ExpressionsTrayView r2 = r10.A09
                r2.setVisibility(r1)
                com.whatsapp.expressionstray.ExpressionsTrayView r2 = r10.A09
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r2)
                r10.A05 = r2
                r2.A0d(r1)
                X.00H r2 = r10.A0E
                java.lang.Object r2 = r2.get()
                X.6pK r2 = (X.C133686pK) r2
                r2.A01(r5)
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r10.A05
                r3 = 3
                X.3bk r2 = new X.3bk
                r2.<init>(r10, r3)
                r4.A0Z(r2)
                r10.A03()
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r10.A05
                r2 = 4
                r3.A0W(r2)
                com.whatsapp.expressionstray.ExpressionsTrayView r2 = r10.A09
                r2.A0C()
                com.whatsapp.expressionstray.ExpressionsTrayView r4 = r10.A09
                if (r4 == 0) goto L_0x0194
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r10.A05
                if (r8 == 0) goto L_0x0194
                com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r9 = r10.A08
                if (r9 == 0) goto L_0x0194
                X.4n1 r11 = r10.A0B
                r11.A07 = r10
                r11.A08 = r0
                r11.A04 = r4
                r11.A00 = r8
                r11.A03 = r9
                android.content.res.Resources r3 = r10.getResources()
                X.4qC r12 = new X.4qC
                r12.<init>(r3, r10, r11)
                X.4nB r7 = new X.4nB
                r7.<init>(r8, r9, r10, r11, r12)
                X.4gl r2 = new X.4gl
                r2.<init>(r3, r11)
                r11.A01 = r2
                r4.A02 = r2
                r4.A0M = r12
                r4.setExpressionsSearchListener(r7)
            L_0x0194:
                X.1DT r2 = r0.A01
                r0 = 39
                X.C91604fx.A00(r10, r2, r0)
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r10)
                r2 = 2131625521(0x7f0e0631, float:1.8878252E38)
                android.view.View r0 = r10.A00
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.view.View r0 = r3.inflate(r2, r0, r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r10.A03 = r0
                return
            L_0x01af:
                X.1SB r6 = r10.A0C
                X.10I r8 = r10.A05
                X.00H r9 = r10.A0G
                X.00H r2 = r10.A0I
                java.lang.Object r5 = r2.get()
                X.2LK r5 = (X.AnonymousClass2LK) r5
                X.0z4 r4 = r10.A0A
                X.00H r2 = r10.A0H
                java.lang.Object r7 = r2.get()
                X.6pA r7 = (X.AnonymousClass6pA) r7
                X.722 r3 = new X.722
                r3.<init>(r4, r5, r6, r7, r8, r9)
                X.7MX r5 = new X.7MX
                r5.<init>(r3)
                r10.A0K = r5
                X.4n1 r4 = r10.A0B
                com.whatsapp.KeyboardPopupLayout r8 = r10.A06
                X.00H r2 = r10.A0D
                java.lang.Object r2 = r2.get()
                X.6uD r2 = (X.C136686uD) r2
                r4.A07 = r10
                r4.A08 = r0
                r4.A0A = r3
                r4.A09 = r5
                r4.A02 = r2
                r2 = 2131431911(0x7f0b11e7, float:1.8485565E38)
                android.view.View r7 = X.C110885hR.A0A(r10, r2)
                com.whatsapp.WaEditText r7 = (com.whatsapp.WaEditText) r7
                X.6qD r11 = r4.A0F
                r11.A00 = r10
                X.6uD r6 = r4.A02
                X.00H r2 = r4.A0I
                java.lang.Object r3 = r2.get()
                X.5ii r3 = (X.C111185ii) r3
                X.722 r2 = r4.A0A
                X.6q9 r2 = r6.A02(r3, r2)
                r11.A04 = r2
                X.6uD r2 = r4.A02
                X.6in r2 = r2.A00()
                r11.A02 = r2
                java.lang.Integer r15 = X.C17880vN.A0i()
                r6 = 0
                r16 = 10
                r12 = r6
                r13 = r8
                r14 = r7
                r11.A01(r12, r13, r14, r15, r16)
                r2 = 1
                r11.A06 = r2
                X.5z4 r2 = r11.A00()
                r4.A05 = r2
                android.content.res.Resources r7 = r10.getResources()
                X.4gl r2 = new X.4gl
                r2.<init>(r7, r4)
                r4.A01 = r2
                X.5z4 r3 = r4.A05
                r3.A0J(r2)
                X.4qD r2 = new X.4qD
                r2.<init>(r7, r10, r4, r5)
                r3.A0N(r2)
                r5.A04 = r2
                X.18K r12 = r4.A0E
                X.6zz r7 = r4.A0G
                r2 = 2131431135(0x7f0b0edf, float:1.848399E38)
                android.view.View r3 = r8.findViewById(r2)
                com.whatsapp.gifsearch.GifSearchContainer r3 = (com.whatsapp.gifsearch.GifSearchContainer) r3
                r2 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
                android.view.View r11 = r8.findViewById(r2)
                com.whatsapp.emoji.search.EmojiSearchContainer r11 = (com.whatsapp.emoji.search.EmojiSearchContainer) r11
                X.5z4 r13 = r4.A05
                X.3xv r9 = new X.3xv
                r14 = r3
                r15 = r7
                r9.<init>((android.app.Activity) r10, (com.whatsapp.emoji.search.EmojiSearchContainer) r11, (X.AnonymousClass18K) r12, (X.C117015z4) r13, (com.whatsapp.gifsearch.GifSearchContainer) r14, (X.C140126zz) r15)
                r4.A06 = r9
                r9.A00 = r4
                X.5z4 r2 = r4.A05
                r5.A01(r2, r6, r10)
                X.722 r2 = r4.A0A
                X.2LK r3 = r2.A0B
                X.6qF r2 = r2.A09
                r3.registerObserver(r2)
                com.whatsapp.KeyboardPopupLayout r2 = r10.A06
                android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
                r2 = 25
                X.C90584eJ.A00(r3, r10, r2)
                goto L_0x0194
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupProfileEmojiEditor.onCreate(android.os.Bundle):void");
        }

        public void CMj(DialogFragment dialogFragment) {
            CMl(dialogFragment);
        }

        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            if (C18020vd.A05(C18040vf.A02, this.A0E, 3792)) {
                A03();
            }
        }

        public boolean onCreateOptionsMenu(Menu menu) {
            MenuItem actionView = AnonymousClass3MX.A07(menu, 2131430123, 2131898925).setActionView(2131625520);
            actionView.setShowAsAction(2);
            if (actionView.getActionView() == null) {
                return true;
            }
            C90014dO.A00(actionView.getActionView(), this, actionView, 42);
            return true;
        }

        public void onDestroy() {
            super.onDestroy();
            C95924n1 r3 = this.A0B;
            C117015z4 r0 = r3.A05;
            if (r0 != null) {
                r0.A0J((C107845ai) null);
                r0.A0N((AnonymousClass88B) null);
                r0.dismiss();
                r3.A05.A0M();
            }
            AnonymousClass7MX r02 = r3.A09;
            if (r02 != null) {
                r02.A04 = null;
                r02.A00();
            }
            C80753xv r03 = r3.A06;
            if (r03 != null) {
                r03.A00 = null;
            }
            AnonymousClass722 r04 = r3.A0A;
            if (r04 != null) {
                r04.A0B.unregisterObserver(r04.A09);
            }
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r3.A03;
            if (emojiSearchKeyboardContainer != null) {
                emojiSearchKeyboardContainer.setOnTouchListener((View.OnTouchListener) null);
                emojiSearchKeyboardContainer.A09 = null;
            }
            ExpressionsTrayView expressionsTrayView = r3.A04;
            if (expressionsTrayView != null) {
                expressionsTrayView.A0D();
                r3.A04 = null;
            }
            r3.A0A = null;
            r3.A09 = null;
            r3.A06 = null;
            r3.A01 = null;
            r3.A02 = null;
            r3.A05 = null;
            r3.A08 = null;
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = this.A08;
            if (emojiSearchKeyboardContainer2 != null) {
                emojiSearchKeyboardContainer2.setOnTouchListener((View.OnTouchListener) null);
                emojiSearchKeyboardContainer2.A09 = null;
            }
            ExpressionsTrayView expressionsTrayView2 = this.A09;
            if (expressionsTrayView2 != null) {
                expressionsTrayView2.A0D();
                this.A09 = null;
            }
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() == 2131430123) {
                C17890vO.A0u(new AnonymousClass49Z(this, (C37101oy) this.A0F.get()), this.A05);
                return true;
            } else if (menuItem.getItemId() != 16908332) {
                return true;
            } else {
                finish();
                return true;
            }
        }

        public boolean onPrepareOptionsMenu(Menu menu) {
            menu.findItem(2131430123).setVisible(AnonymousClass000.A1W(this.A00));
            return true;
        }

        public GroupProfileEmojiEditor(int i) {
            this.A0L = false;
            C91014f0.A00(this, 20);
        }
    }
