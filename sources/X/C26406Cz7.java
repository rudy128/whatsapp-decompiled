package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;

/* renamed from: X.Cz7  reason: case insensitive filesystem */
public class C26406Cz7 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public C26406Cz7(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.1Xj, X.BKz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.1Xj, X.BKy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.1Xj, X.BKx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.view.View$BaseSavedState, java.lang.Object, X.BHN] */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.1Xj, X.27g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v9, types: [X.1Xj, X.BKw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v14, types: [X.1Xj, java.lang.Object, X.BL1] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ? baseSavedState;
        switch (this.A00) {
            case 0:
                return new BL2(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return C27741Xj.A01;
                }
                throw AnonymousClass000.A0n("superState must be null");
            case 2:
                return new C26550D3n(parcel, classLoader);
            case 3:
                ? r2 = new C27741Xj(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = C38251qy.class.getClassLoader();
                }
                r2.A00 = parcel.readParcelable(classLoader);
                return r2;
            case 4:
                ? r22 = new C27741Xj(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = r22.getClass().getClassLoader();
                }
                r22.A00 = parcel.readInt();
                r22.A01 = parcel.readParcelable(classLoader);
                r22.A02 = classLoader;
                return r22;
            case 5:
                if (Build.VERSION.SDK_INT >= 24) {
                    return baseSavedState;
                }
                baseSavedState = new View.BaseSavedState(parcel);
                BEA.A16(parcel, baseSavedState, (ClassLoader) null);
                return baseSavedState;
            case 6:
                return new BL3(parcel, classLoader);
            case 7:
                return new BL5(parcel, classLoader);
            case 8:
                ? r23 = new C27741Xj(parcel, classLoader);
                if (classLoader == null) {
                    r23.getClass().getClassLoader();
                }
                r23.A00 = C17890vO.A1R(parcel.readInt());
                return r23;
            case 9:
                ? r24 = new C27741Xj(parcel, classLoader);
                r24.A00 = C17890vO.A1R(parcel.readInt());
                return r24;
            case 10:
                SparseArray sparseArray = new SparseArray();
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
                for (int i = 0; i < readInt; i++) {
                    sparseArray.put(iArr[i], readParcelableArray[i]);
                }
                return sparseArray;
            case 11:
                ? r25 = new C27741Xj(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = r25.getClass().getClassLoader();
                }
                r25.A00 = parcel.readBundle(classLoader);
                return r25;
            case 12:
                return new BL4(parcel, classLoader);
            case 13:
                return new BL6(parcel, classLoader);
            default:
                ? r26 = new C27741Xj(parcel, classLoader);
                r26.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                r26.A01 = C17890vO.A1R(parcel.readInt());
                return r26;
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new BL2[i];
            case 1:
                return new C27741Xj[i];
            case 2:
                return new C26550D3n[i];
            case 3:
                return new C22694BKw[i];
            case 4:
                return new AnonymousClass27g[i];
            case 5:
                return new BHN[i];
            case 6:
                return new BL3[i];
            case 7:
                return new BL5[i];
            case 8:
                return new C22695BKx[i];
            case 9:
                return new C22696BKy[i];
            case 10:
                return new C22638BGy[i];
            case 11:
                return new C22697BKz[i];
            case 12:
                return new BL4[i];
            case 13:
                return new BL6[i];
            default:
                return new BL1[i];
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.1Xj, X.BKz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.1Xj, X.BKy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.1Xj, X.BKx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.view.View$BaseSavedState, java.lang.Object, X.BHN] */
    /* JADX WARNING: type inference failed for: r3v8, types: [X.1Xj, X.27g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.1Xj, X.BKw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v14, types: [X.1Xj, java.lang.Object, X.BL1] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ? baseSavedState;
        switch (this.A00) {
            case 0:
                return new BL2(parcel, (ClassLoader) null);
            case 1:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return C27741Xj.A01;
                }
                throw AnonymousClass000.A0n("superState must be null");
            case 2:
                return new C26550D3n(parcel, (ClassLoader) null);
            case 3:
                ? r3 = new C27741Xj(parcel, (ClassLoader) null);
                r3.A00 = AnonymousClass3Ma.A08(parcel, C38251qy.class);
                return r3;
            case 4:
                ? r32 = new C27741Xj(parcel, (ClassLoader) null);
                ClassLoader classLoader = r32.getClass().getClassLoader();
                r32.A00 = parcel.readInt();
                r32.A01 = parcel.readParcelable(classLoader);
                r32.A02 = classLoader;
                return r32;
            case 5:
                if (Build.VERSION.SDK_INT >= 24) {
                    return baseSavedState;
                }
                baseSavedState = new View.BaseSavedState(parcel);
                BEA.A16(parcel, baseSavedState, (ClassLoader) null);
                return baseSavedState;
            case 6:
                return new BL3(parcel, (ClassLoader) null);
            case 7:
                return new BL5(parcel, (ClassLoader) null);
            case 8:
                ? r33 = new C27741Xj(parcel, (ClassLoader) null);
                r33.getClass().getClassLoader();
                r33.A00 = C17890vO.A1R(parcel.readInt());
                return r33;
            case 9:
                ? r34 = new C27741Xj(parcel, (ClassLoader) null);
                r34.A00 = C17890vO.A1R(parcel.readInt());
                return r34;
            case 10:
                SparseArray sparseArray = new SparseArray();
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                Parcelable[] readParcelableArray = parcel.readParcelableArray((ClassLoader) null);
                for (int i = 0; i < readInt; i++) {
                    sparseArray.put(iArr[i], readParcelableArray[i]);
                }
                return sparseArray;
            case 11:
                ? r35 = new C27741Xj(parcel, (ClassLoader) null);
                r35.A00 = BE8.A0K(parcel, r35.getClass());
                return r35;
            case 12:
                return new BL4(parcel, (ClassLoader) null);
            case 13:
                return new BL6(parcel, (ClassLoader) null);
            default:
                ? r36 = new C27741Xj(parcel, (ClassLoader) null);
                r36.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                r36.A01 = C17890vO.A1R(parcel.readInt());
                return r36;
        }
    }
}
