package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5lP  reason: invalid class name and case insensitive filesystem */
public class C112395lP extends C38391rD implements AnonymousClass87G {
    public int A00 = 0;
    public C131976ly A01;
    public LinkedHashMap A02 = C17880vN.A13();
    public List A03 = AnonymousClass000.A13();
    public int A04 = 0;
    public final /* synthetic */ AnonymousClass72m A05;

    public static void A02(Context context, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass71G(context.getString(i), 1));
    }

    public static void A03(C112395lP r4) {
        r4.A04 = 0;
        Iterator A0j = C17890vO.A0j(r4.A02);
        while (A0j.hasNext()) {
            List list = (List) A0j.next();
            if (list.size() > 1) {
                r4.A04 = C108945cZ.A0A(list, r4.A04);
            } else {
                return;
            }
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C113245mm(AnonymousClass3MZ.A0D(viewGroup).inflate(2131626932, viewGroup, false), this);
        }
        if (i == 1) {
            return new C113095mX(AnonymousClass3MZ.A0D(viewGroup).inflate(2131626936, viewGroup, false), this);
        }
        if (i == 2) {
            return new C113235ml(AnonymousClass3MZ.A0D(viewGroup).inflate(2131626935, viewGroup, false), this);
        }
        if (i == 3) {
            return new C113045mS(AnonymousClass3MZ.A0D(viewGroup).inflate(2131626934, viewGroup, false), this, 0);
        }
        if (i == 4) {
            return new C113045mS(AnonymousClass3MZ.A0D(viewGroup).inflate(2131626937, viewGroup, false), this, 1);
        }
        C17900vP.A0i("shapepicker/onCreateViewHolder/invalid state ", AnonymousClass000.A10(), i);
        return null;
    }

    public C112395lP(AnonymousClass72m r2) {
        this.A05 = r2;
    }

    public static AnonymousClass71G A00(C112395lP r4, int i) {
        Object obj;
        if (i < r4.A03.size()) {
            obj = r4.A03.get(i);
        } else if (r4.A05.A0O.A0T(1) && i == r4.A0Q() - 1) {
            return new AnonymousClass71G(4);
        } else {
            int size = i - r4.A03.size();
            Iterator A0j = C17890vO.A0j(r4.A02);
            while (A0j.hasNext()) {
                List list = (List) A0j.next();
                if (size < list.size()) {
                    obj = list.get(size);
                } else {
                    size -= list.size();
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Could not translate adapter position ");
            A10.append(i);
            throw AnonymousClass001.A12(" to a grid item.", A10);
        }
        return (AnonymousClass71G) obj;
    }

    public static ArrayList A01(C112395lP r4, AnonymousClass725 r5) {
        Collection<AnonymousClass7JE> collection = (Collection) r4.A05.A0a.get(r5.A0H);
        C17960vV.A07(collection);
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(new AnonymousClass71G(r5.A04, 1));
        int i = 0;
        for (AnonymousClass7JE r1 : collection) {
            A13.add(new AnonymousClass71G((AnonymousClass8B0) r1, i));
            i++;
        }
        return A13;
    }

    public static void A04(C112395lP r9) {
        AnonymousClass72m r7 = r9.A05;
        C1196969m r3 = r7.A0T;
        if (r3 != null) {
            ArrayList A13 = AnonymousClass000.A13();
            ArrayList A132 = AnonymousClass000.A13();
            Iterator A0i = C17890vO.A0i(r9.A02);
            int i = 0;
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                if (i >= r9.A04 - 1) {
                    break;
                }
                A13.add(r7.A0Z.get(A16.getKey()));
                C17890vO.A1D(A132, r9.A03.size() + i);
                i = C108945cZ.A0A((List) A16.getValue(), i);
            }
            C17960vV.A0C(AnonymousClass000.A1T(A13.size(), A132.size()));
            List list = r3.A03;
            list.clear();
            list.addAll(A13);
            ArrayList A10 = C17880vN.A10(A132);
            if (r3.A01) {
                C17890vO.A1D(A10, 0);
            }
            C112315lH r0 = r3.A07;
            r0.A02 = A10;
            Collections.sort(A10);
            r0.notifyDataSetChanged();
            C112315lH.A01(r0);
            AnonymousClass6z6.A00(r3);
        }
    }

    public int A0Q() {
        AnonymousClass72m r1 = this.A05;
        boolean z = true;
        boolean A0T = r1.A0O.A0T(1);
        C111085iA r3 = r1.A0N;
        int i = 0;
        if (r3 == null || !AnonymousClass000.A1P(C72463Mc.A0A(r3.A03))) {
            z = false;
        }
        int size = this.A03.size();
        if (z && C108945cZ.A1F(r3.A02).isEmpty()) {
            i = this.A04 + (A0T ? 1 : 0);
        }
        return size + i;
    }

    public void A0R(C42011xT r3) {
        ImageView imageView;
        if (r3 instanceof C113245mm) {
            List list = C42011xT.A0I;
            imageView = ((C113245mm) r3).A01;
        } else if (r3 instanceof C113235ml) {
            imageView = ((C113235ml) r3).A00;
        } else {
            return;
        }
        imageView.setImageDrawable((Drawable) null);
    }

    public void A0U() {
        int i;
        AnonymousClass8B0[] A012;
        int size = this.A03.size();
        this.A03.clear();
        AnonymousClass72m r10 = this.A05;
        int i2 = this.A00 * 2;
        boolean A1P = AnonymousClass000.A1P(C72463Mc.A0A(r10.A0N.A03));
        ArrayList A13 = AnonymousClass000.A13();
        if (A1P) {
            C1196969m r5 = r10.A0T;
            if (r5 != null && !r5.A01) {
                r5.A01 = true;
                C112315lH r2 = r5.A07;
                r2.A02.add(0);
                Collections.sort(r2.A02);
                r2.notifyDataSetChanged();
                C112315lH.A01(r2);
                AnonymousClass6z6.A00(r5);
            }
            C1193367s r22 = r10.A0F;
            if (!AnonymousClass000.A1W(r22.A03)) {
                A02(r10.A05, A13, 2131889728);
                A13.add(new AnonymousClass71G(3));
            } else if (r22.A03() > 0) {
                A02(r10.A05, A13, 2131889728);
                Iterator it = r22.A06(i2).iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    A13.add(new AnonymousClass71G((AnonymousClass8B0) it.next(), i3));
                    i3++;
                }
            } else if (r5 != null && r5.A01) {
                r5.A01 = false;
                C112315lH r1 = r5.A07;
                r1.A02.remove(0);
                Collections.sort(r1.A02);
                r1.notifyDataSetChanged();
                C112315lH.A01(r1);
                AnonymousClass6z6.A00(r5);
            }
            for (Integer num : AnonymousClass00R.A00(2)) {
                Activity activity = r10.A05;
                if (1 - num.intValue() != 0) {
                    i = 2131896072;
                } else {
                    i = 2131896073;
                }
                A02(activity, A13, i);
                C18030ve r12 = r10.A0D;
                if (num.intValue() != 0) {
                    A012 = AnonymousClass711.A00;
                } else {
                    A012 = AnonymousClass711.A01(r12);
                }
                int i4 = 0;
                for (AnonymousClass8B0 r13 : A012) {
                    A13.add(new AnonymousClass71G(r13, i4));
                    i4++;
                }
            }
            AnonymousClass1DT r14 = r10.A0O.A00;
            C127476eQ r0 = (C127476eQ) r14.A06();
            if (r0 != null && r0.A01) {
                Set<AnonymousClass7JE> set = r10.A0b;
                if (set.size() > 0) {
                    A02(r10.A05, A13, 2131896070);
                    int i5 = 0;
                    for (AnonymousClass7JE r15 : set) {
                        A13.add(new AnonymousClass71G((AnonymousClass8B0) r15, i5));
                        i5++;
                    }
                }
            }
            C127476eQ r02 = (C127476eQ) r14.A06();
            if (r02 == null || !r02.A01) {
                A02(r10.A05, A13, 2131896070);
                A13.add(new AnonymousClass71G(3));
            }
        } else {
            ArrayList A132 = AnonymousClass000.A13();
            C128996h5[] A002 = C137786w1.A00(r10.A0D);
            int i6 = 0;
            do {
                C128996h5 r4 = A002[i6];
                C17890vO.A1D(A132, A13.size());
                A13.add(new AnonymousClass71G(r10.A05.getString(r4.A02), 1));
                int i7 = 0;
                for (AnonymousClass737 r16 : (List) r4.A03.get()) {
                    AnonymousClass7JD r23 = new AnonymousClass7JD(r16, r10.A0C);
                    A13.add(new AnonymousClass71G((AnonymousClass8B0) r23, i7));
                    i7++;
                    r10.A0e.put(r23.Ba8(), r23);
                }
                i6++;
            } while (i6 < 8);
            C1197069n r17 = r10.A0S;
            C17960vV.A0C(AnonymousClass000.A1T(A132.size(), 8));
            C112315lH r03 = r17.A07;
            r03.A02 = A132;
            Collections.sort(A132);
            r03.notifyDataSetChanged();
            C112315lH.A01(r03);
            AnonymousClass6z6.A00(r17);
        }
        this.A03 = A13;
        A0J(0, Math.max(size, A13.size()));
        if (size != this.A03.size()) {
            A04(this);
        }
    }

    public void A0V(String str) {
        List list = (List) this.A02.get(str);
        if (list != null) {
            Iterator A0i = C17890vO.A0i(this.A02);
            int i = 0;
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                if (str.equals(A16.getKey())) {
                    int A0A = C108945cZ.A0A(this.A03, i);
                    this.A02.remove(str);
                    A03(this);
                    this.A01.A03(A0A, list.size());
                    A04(this);
                    return;
                }
                i = C108945cZ.A0A((List) A16.getValue(), i);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Sticker pack id ");
            A10.append(str);
            throw AnonymousClass001.A12(" is not contained in data set", A10);
        }
    }

    public void C3x(C131976ly r6) {
        if (r6.equals(this.A01)) {
            this.A03 = AnonymousClass000.A13();
            List list = r6.A01;
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    AnonymousClass8B0 r2 = (AnonymousClass8B0) list.get(i);
                    this.A05.A0e.put(r2.Ba8(), r2);
                    this.A03.add(new AnonymousClass71G((AnonymousClass8B0) list.get(i), i));
                }
            } else {
                this.A03.add(new AnonymousClass71G(C108945cZ.A1F(this.A05.A0N.A02), 2));
            }
            notifyDataSetChanged();
        }
    }

    public void Bmc(C42011xT r10, int i) {
        String A0E;
        C127466eP r1;
        AnonymousClass71G A002 = A00(this, i);
        int i2 = A002.A02;
        if (i2 == 0) {
            C113245mm r102 = (C113245mm) r10;
            List list = C42011xT.A0I;
            ShapeItemView shapeItemView = r102.A01;
            AnonymousClass8B0 r5 = A002.A03;
            C17960vV.A07(r5);
            r102.A00 = r5;
            shapeItemView.A01 = r5.Ba8();
            AnonymousClass8B0 r4 = r102.A00;
            if (r4.CFb()) {
                AnonymousClass72m r2 = this.A05;
                Reference reference = (Reference) r2.A0c.get(r5.Ba8());
                if (reference == null || (r1 = (C127466eP) reference.get()) == null) {
                    shapeItemView.setImageDrawable(new C109385dM());
                    shapeItemView.setContentDescription((CharSequence) null);
                    C109605di r42 = r2.A0K;
                    Message obtain = Message.obtain(r42, 0, 0, 0, shapeItemView);
                    String Ba8 = r5.Ba8();
                    Bundle A0D = C17880vN.A0D();
                    A0D.putString("tag_bundle_key", Ba8);
                    obtain.setData(A0D);
                    r42.sendMessageAtFrontOfQueue(obtain);
                    return;
                }
                shapeItemView.setImageDrawable(r1.A00);
                A0E = r1.A01;
            } else {
                Context context = shapeItemView.getContext();
                AnonymousClass72m r22 = this.A05;
                C1409773u BHq = r4.BHq(context, r22.A0B, true);
                BHq.A0K(r22.A01);
                if (BHq.A0T()) {
                    BHq.A0J(r22.A00);
                }
                shapeItemView.setImageDrawable(new C109395dN(BHq));
                A0E = BHq.A0E(r22.A05);
            }
            shapeItemView.setContentDescription(A0E);
        } else if (i2 == 1) {
            ((C113095mX) r10).A00.setText(A002.A04);
        } else if (i2 == 2) {
            AnonymousClass72m r0 = this.A05;
            AnonymousClass1KW r8 = r0.A0C;
            Activity activity = r0.A05;
            BitmapDrawable A07 = r8.A07(activity.getResources(), new C117025z5(new int[]{129335}), -1);
            C113235ml r103 = (C113235ml) r10;
            r103.A01.setText(C17880vN.A0q(activity, A002.A04, new Object[1], 0, 2131896527));
            r103.A00.setImageDrawable(A07);
        }
    }

    public int getItemViewType(int i) {
        return A00(this, i).A02;
    }
}
