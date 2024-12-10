package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.72m  reason: invalid class name */
public class AnonymousClass72m {
    public float A00;
    public int A01;
    public AnonymousClass6Hm A02;
    public AnonymousClass6z6 A03;
    public boolean A04;
    public final Activity A05;
    public final HandlerThread A06;
    public final View A07;
    public final View A08;
    public final ViewGroup A09;
    public final AnonymousClass1F9 A0A;
    public final C18000vb A0B;
    public final AnonymousClass1KW A0C;
    public final C18030ve A0D;
    public final MediaComposerFragment A0E;
    public final C1193367s A0F;
    public final AnonymousClass7IT A0G;
    public final AnonymousClass87S A0H;
    public final C112395lP A0I;
    public final C109585dg A0J;
    public final C109605di A0K;
    public final C112725lw A0L;
    public final AnonymousClass71R A0M;
    public final C111085iA A0N;
    public final C111305jV A0O;
    public final ShapePickerRecyclerView A0P;
    public final ShapePickerView A0Q;
    public final C1192967n A0R;
    public final C1197069n A0S;
    public final C1196969m A0T;
    public final C134226qF A0U = new AnonymousClass6H5(this, 1);
    public final AnonymousClass2LK A0V;
    public final AnonymousClass1L4 A0W;
    public final C41111vp A0X = AnonymousClass3MW.A0n(AnonymousClass000.A0h());
    public final AnonymousClass10I A0Y;
    public final Map A0Z = C17880vN.A11();
    public final Map A0a = C17880vN.A11();
    public final Set A0b = C17880vN.A14();
    public final ConcurrentHashMap A0c = new ConcurrentHashMap();
    public final ConcurrentHashMap A0d = new ConcurrentHashMap();
    public final ConcurrentHashMap A0e;
    public final C126126cE A0f = new C126126cE(this);
    public final C26631Sw A0g;

    public static ArrayList A00(AnonymousClass72m r5, AnonymousClass725 r6) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = r6.A07.iterator();
        while (it.hasNext()) {
            A13.add(new AnonymousClass7JE(C108945cZ.A0x(it), r5.A0g));
        }
        return A13;
    }

    public static void A01(AnonymousClass72m r5, Collection collection, boolean z) {
        LinkedHashSet A14 = C17880vN.A14();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass7JE r2 = new AnonymousClass7JE(C108945cZ.A0x(it), r5.A0g);
            r5.A0e.put(r2.Ba8(), r2);
            A14.add(r2);
        }
        if (z) {
            Set set = r5.A0b;
            A14.addAll(set);
            set.clear();
        }
        Set<AnonymousClass8B0> set2 = r5.A0b;
        set2.addAll(A14);
        AnonymousClass7IT r3 = r5.A0G;
        synchronized (r3) {
            Map map = r3.A00;
            map.clear();
            for (AnonymousClass8B0 A002 : set2) {
                AnonymousClass7IT.A00(A002, map);
            }
        }
    }

    public static void A02(AnonymousClass72m r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass7JE r2 = (AnonymousClass7JE) it.next();
            r4.A0e.put(r2.Ba8(), r2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.1Ir, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v21, types: [X.1Ir, java.lang.Object] */
    public AnonymousClass72m(Activity activity, ViewGroup viewGroup, AnonymousClass1F9 r27, AnonymousClass1FD r28, C18000vb r29, AnonymousClass1KW r30, C18030ve r31, MediaComposerFragment mediaComposerFragment, C1193367s r33, AnonymousClass7IT r34, AnonymousClass87S r35, ShapePickerView shapePickerView, C1192967n r37, C26631Sw r38, AnonymousClass2LK r39, AnonymousClass1SB r40, AnonymousClass1L4 r41, AnonymousClass10I r42) {
        Activity activity2 = activity;
        this.A05 = activity2;
        C18030ve r1 = r31;
        this.A0D = r1;
        AnonymousClass1L4 r9 = r41;
        this.A0W = r9;
        AnonymousClass10I r6 = r42;
        this.A0Y = r6;
        this.A0C = r30;
        C1193367s r13 = r33;
        this.A0F = r13;
        C18000vb r23 = r29;
        this.A0B = r23;
        AnonymousClass2LK r8 = r39;
        this.A0V = r8;
        C1192967n r22 = r37;
        this.A0R = r22;
        this.A0G = r34;
        this.A0g = r38;
        AnonymousClass1F9 r11 = r27;
        this.A0A = r11;
        this.A0H = r35;
        this.A09 = viewGroup;
        this.A0E = mediaComposerFragment;
        AnonymousClass1FD r12 = r28;
        this.A0O = (C111305jV) new C24071It(new Object(), r12).A00(C111305jV.class);
        this.A0N = (C111085iA) new C24071It(new Object(), r12).A00(C111085iA.class);
        C112395lP r4 = new C112395lP(this);
        this.A0I = r4;
        ShapePickerView shapePickerView2 = shapePickerView;
        this.A0Q = shapePickerView2;
        this.A08 = AnonymousClass1HF.A06(shapePickerView2, 2131435345);
        this.A07 = AnonymousClass1HF.A06(shapePickerView2, 2131435346);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) AnonymousClass1HF.A06(shapePickerView2, 2131435353);
        this.A0P = shapePickerRecyclerView;
        shapePickerRecyclerView.setAdapter(r4);
        ArrayList A002 = AnonymousClass711.A00(r1);
        this.A0e = new ConcurrentHashMap();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            AnonymousClass8B0 r43 = (AnonymousClass8B0) it.next();
            this.A0e.put(r43.Ba8(), r43);
        }
        this.A0S = new C1197069n(AnonymousClass3MX.A0Q(shapePickerView2, 2131430340), this.A0f, this.A0P);
        AnonymousClass1SB r15 = r40;
        C1196969m r0 = new C1196969m(AnonymousClass3MX.A0Q(shapePickerView2, 2131435767), this.A0f, this.A0P, r15);
        this.A0T = r0;
        this.A03 = r0;
        r0.A01 = true;
        AnonymousClass6z6.A00(r0);
        C112725lw r14 = new C112725lw(this.A05, this);
        this.A0L = r14;
        this.A0P.A0t(r14);
        this.A0P.setItemAnimator((C37961qT) null);
        AnonymousClass7AO.A01(r11, this.A0O.A01, this, 46);
        AnonymousClass7AO.A01(r11, this.A0O.A00, this, 47);
        AnonymousClass7AO.A01(r11, this.A0O.A02, this, 48);
        C111305jV r02 = this.A0O;
        AnonymousClass6Hm r16 = new AnonymousClass6Hm(r02.A01, r02.A02, r02.A00, r13, r15);
        this.A02 = r16;
        r16.A00 = this.A0O;
        AnonymousClass3MW.A1T(r16, r6, 0);
        AnonymousClass7AO.A01(r11, this.A0N.A03, this, 49);
        AnonymousClass7AQ.A01(r11, this.A0N.A01, this, 0);
        AnonymousClass7AQ.A01(r11, this.A0N.A02, this, 1);
        AnonymousClass7AQ.A01(r11, this.A0N.A00, this, 2);
        this.A0M = new AnonymousClass71R(activity2, this.A07, r11, r12, r23, r22, r9, this.A0X);
        AnonymousClass7AQ.A01(r11, this.A0X, this, 3);
        AnonymousClass3MY.A1B(shapePickerView2, 2131435347, 0);
        this.A08.setVisibility(8);
        this.A0P.setClipToPadding(true);
        this.A0P.A0r(new C112615ll(this, this.A05.getResources().getDimensionPixelSize(2131168703), this.A05.getResources().getDimensionPixelSize(2131168700), AnonymousClass3MW.A1Z(r23)));
        r8.registerObserver(this.A0U);
        HandlerThread handlerThread = new HandlerThread("Shapes Thread", 1);
        this.A06 = handlerThread;
        handlerThread.start();
        this.A0K = new C109605di(activity2, handlerThread.getLooper(), this);
        this.A0J = new C109585dg(activity2.getMainLooper(), this);
        int A012 = AnonymousClass3MZ.A01(this.A05, 2131166575);
        for (int min = Math.min(((C72453Mb.A09(this.A05) * C108965cb.A08(this.A05).heightPixels) / (A012 * A012)) + 1, A002.size() - 1); min >= 0; min--) {
            Message obtain = Message.obtain(this.A0K, 0, 0, 0, (Object) null);
            String Ba8 = ((AnonymousClass8B0) A002.get(min)).Ba8();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("tag_bundle_key", Ba8);
            obtain.setData(A0D2);
            obtain.sendToTarget();
        }
    }
}
