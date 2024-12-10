package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* renamed from: X.CZl  reason: case insensitive filesystem */
public abstract class C25135CZl {
    public final Object A00 = C17880vN.A0p();

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Bb3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.Bb3, java.lang.Object] */
    public SparseArray A00(C24878CNw cNw) {
        C23104BbJ[] bbJArr;
        C24996CSw[] cSwArr;
        CLP[] clpArr;
        CLO[] cloArr;
        int i;
        C24878CNw cNw2 = cNw;
        if (this instanceof C23503BiC) {
            C23503BiC biC = (C23503BiC) this;
            ByteBuffer byteBuffer = cNw2.A00;
            synchronized (biC.A03) {
                if (biC.A00) {
                    C23494Bhy bhy = biC.A01;
                    C18210vx.A00(byteBuffer);
                    ? obj = new Object();
                    C24976CSb cSb = cNw2.A01;
                    obj.A00 = cSb.A00;
                    obj.A01 = cSb.A01;
                    obj.A03 = cSb.A03;
                    obj.A02 = cSb.A02;
                    obj.A04 = cSb.A04;
                    if (!AnonymousClass000.A1W(bhy.A00())) {
                        cSwArr = new C24996CSw[0];
                    } else {
                        try {
                            C23228Bde bde = new C23228Bde(byteBuffer);
                            Object A002 = bhy.A00();
                            C18210vx.A00(A002);
                            C23442Bh7 bh7 = (C23442Bh7) ((ECA) A002);
                            Parcel obtain = Parcel.obtain();
                            BE9.A15(bde, obtain, bh7.A01);
                            int A1V = BE8.A1V(obtain);
                            obj.writeToParcel(obtain, 0);
                            Parcel A003 = bh7.A00(obtain);
                            C23103BbI[] bbIArr = (C23103BbI[]) A003.createTypedArray(C23103BbI.CREATOR);
                            A003.recycle();
                            int length = bbIArr.length;
                            cSwArr = new C24996CSw[length];
                            for (int i2 = 0; i2 < length; i2++) {
                                C23103BbI bbI = bbIArr[i2];
                                int i3 = bbI.A0B;
                                PointF pointF = new PointF(bbI.A00, bbI.A01);
                                float f = bbI.A02;
                                float f2 = bbI.A03;
                                C23086Bb1[] bb1Arr = bbI.A0C;
                                if (bb1Arr == null) {
                                    clpArr = new CLP[A1V];
                                } else {
                                    int length2 = bb1Arr.length;
                                    clpArr = new CLP[length2];
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        C23086Bb1 bb1 = bb1Arr[i4];
                                        clpArr[i4] = new CLP(new PointF(bb1.A00, bb1.A01));
                                    }
                                }
                                C23050BaR[] baRArr = bbI.A0D;
                                if (baRArr == null) {
                                    cloArr = new CLO[A1V];
                                } else {
                                    int length3 = baRArr.length;
                                    cloArr = new CLO[length3];
                                    for (int i5 = 0; i5 < length3; i5++) {
                                        cloArr[i5] = new CLO(baRArr[i5].A01);
                                    }
                                }
                                cSwArr[i2] = new C24996CSw(pointF, cloArr, clpArr, f, f2, i3);
                            }
                        } catch (RemoteException e) {
                            Log.e("FaceNativeHandle", "Could not call native face detector", e);
                            cSwArr = new C24996CSw[0];
                        }
                    }
                } else {
                    throw AnonymousClass000.A0n("Cannot use detector after release()");
                }
            }
            HashSet A12 = C17880vN.A12();
            SparseArray sparseArray = new SparseArray(r12);
            int i6 = 0;
            for (C24996CSw cSw : cSwArr) {
                int i7 = cSw.A02;
                i6 = Math.max(i6, i7);
                if (C108965cb.A1Z(A12, i7)) {
                    i7 = i6 + 1;
                    i6 = i7;
                }
                C17890vO.A1D(A12, i7);
                C25549Chn chn = biC.A02;
                synchronized (C25549Chn.A03) {
                    SparseIntArray sparseIntArray = chn.A00;
                    i = sparseIntArray.get(i7, -1);
                    if (i == -1) {
                        i = C25549Chn.A02;
                        C25549Chn.A02 = i + 1;
                        sparseIntArray.append(i7, i);
                        chn.A01.append(i, i7);
                    }
                }
                sparseArray.append(i, cSw);
            }
            return sparseArray;
        }
        ? obj2 = new Object();
        C24976CSb cSb2 = cNw2.A01;
        obj2.A00 = cSb2.A00;
        obj2.A01 = cSb2.A01;
        obj2.A03 = cSb2.A03;
        obj2.A02 = cSb2.A02;
        obj2.A04 = cSb2.A04;
        ByteBuffer byteBuffer2 = cNw2.A00;
        C23493Bhx bhx = ((C23502BiB) this).A00;
        C18210vx.A00(byteBuffer2);
        if (!AnonymousClass000.A1W(bhx.A00())) {
            bbJArr = new C23104BbJ[0];
        } else {
            try {
                C23228Bde bde2 = new C23228Bde(byteBuffer2);
                Object A004 = bhx.A00();
                C18210vx.A00(A004);
                C26394Cyu cyu = (C26394Cyu) ((EC0) A004);
                Parcel obtain2 = Parcel.obtain();
                BE9.A15(bde2, obtain2, cyu.A01);
                obtain2.writeInt(1);
                obj2.writeToParcel(obtain2, 0);
                Parcel A005 = cyu.A00(obtain2);
                bbJArr = (C23104BbJ[]) A005.createTypedArray(C23104BbJ.CREATOR);
                A005.recycle();
            } catch (RemoteException e2) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                bbJArr = new C23104BbJ[0];
            }
        }
        SparseArray sparseArray2 = new SparseArray(r5);
        for (C23104BbJ bbJ : bbJArr) {
            sparseArray2.append(bbJ.A0C.hashCode(), bbJ);
        }
        return sparseArray2;
    }

    public void A01() {
        synchronized (this.A00) {
        }
    }

    public boolean A02() {
        if (this instanceof C23503BiC) {
            return AnonymousClass000.A1W(((C23503BiC) this).A01.A00());
        }
        return AnonymousClass000.A1W(((C23502BiB) this).A00.A00());
    }
}
