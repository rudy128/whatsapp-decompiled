package com.whatsapp.lists.picker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1OB;
import X.AnonymousClass5IN;
import X.AnonymousClass5QI;
import X.C107185Ys;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import com.whatsapp.lists.ListsRepository;
import java.util.HashSet;
import java.util.List;

public final class ListsContactPickerViewModel extends AnonymousClass1J2 {
    public AnonymousClass1OB A00;
    public final C107185Ys A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass00H A04;
    public final HashSet A05 = C17880vN.A12();
    public final List A06 = AnonymousClass000.A13();
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5IN(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(AnonymousClass5QI.A00);
    public final C18600wl A09;
    public final ListsRepository A0A;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C41761x1 r6, com.whatsapp.lists.picker.ListsContactPickerViewModel r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C100444uW
            if (r0 == 0) goto L_0x0043
            r5 = r8
            X.4uW r5 = (X.C100444uW) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0043
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r2) goto L_0x0049
            java.lang.Object r1 = r5.L$0
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            X.C30691eM.A01(r4)
        L_0x0024:
            java.util.Collection r4 = (java.util.Collection) r4
            r1.addAll(r4)
        L_0x0029:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002c:
            X.C30691eM.A01(r4)
            if (r6 == 0) goto L_0x0029
            java.util.HashSet r1 = r7.A05
            r1.clear()
            com.whatsapp.lists.ListsRepository r0 = r7.A0A
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r4 = r0.A04(r6, r5)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0043:
            X.4uW r5 = new X.4uW
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.picker.ListsContactPickerViewModel.A00(X.1x1, com.whatsapp.lists.picker.ListsContactPickerViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.AnonymousClass4CZ r9, com.whatsapp.lists.picker.ListsContactPickerViewModel r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C100894vF
            if (r0 == 0) goto L_0x006b
            r8 = r11
            X.4vF r8 = (X.C100894vF) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r1 = r8.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r6) goto L_0x0071
            java.lang.Object r5 = r8.L$3
            X.4rF r5 = (X.C98494rF) r5
            java.lang.Object r0 = r8.L$1
            X.4rF r0 = (X.C98494rF) r0
            java.lang.Object r10 = r8.L$0
            com.whatsapp.lists.picker.ListsContactPickerViewModel r10 = (com.whatsapp.lists.picker.ListsContactPickerViewModel) r10
            X.C30691eM.A01(r1)
        L_0x002c:
            r5.element = r1
            android.os.SystemClock.uptimeMillis()
            java.lang.Object r1 = r0.element
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x003c
            java.util.List r0 = r10.A06
            r0.addAll(r1)
        L_0x003c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x003f:
            X.C30691eM.A01(r1)
            X.4rF r5 = X.C98494rF.A00()
            X.11P r1 = r10.A03
            long r3 = android.os.SystemClock.uptimeMillis()
            r0 = 0
            com.whatsapp.lists.picker.ListsContactPickerViewModel$loadSuggestions$2$1 r2 = new com.whatsapp.lists.picker.ListsContactPickerViewModel$loadSuggestions$2$1
            r2.<init>(r9, r10, r0)
            r8.L$0 = r10
            r8.L$1 = r5
            r8.L$2 = r1
            r8.L$3 = r5
            r8.L$4 = r10
            r8.J$0 = r3
            r8.label = r6
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = X.AnonymousClass4Z5.A00(r8, r2, r0)
            if (r1 != r7) goto L_0x0069
            return r7
        L_0x0069:
            r0 = r5
            goto L_0x002c
        L_0x006b:
            X.4vF r8 = new X.4vF
            r8.<init>(r10, r11)
            goto L_0x0012
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.picker.ListsContactPickerViewModel.A03(X.4CZ, com.whatsapp.lists.picker.ListsContactPickerViewModel, X.1dr):java.lang.Object");
    }

    public ListsContactPickerViewModel(C107185Ys r2, AnonymousClass1M9 r3, AnonymousClass11P r4, ListsRepository listsRepository, AnonymousClass00H r6, C18600wl r7) {
        C18070vi.A0w(r4, r3, r2, r6, r7);
        C18070vi.A0d(listsRepository, 6);
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r6;
        this.A09 = r7;
        this.A0A = listsRepository;
    }
}
