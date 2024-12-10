package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Cn7  reason: case insensitive filesystem */
public abstract class C25849Cn7 {
    public final AnonymousClass00P A00;
    public final AnonymousClass00P A01;
    public final AnonymousClass00P A02;

    public C22717BMe A03() {
        C22717BMe bMe = (C22717BMe) this;
        Parcel parcel = bMe.A05;
        int dataPosition = parcel.dataPosition();
        int i = bMe.A02;
        if (i == bMe.A04) {
            i = bMe.A03;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(bMe.A07);
        return new C22717BMe(parcel, bMe.A01, bMe.A02, bMe.A00, AnonymousClass000.A0y("  ", A10), dataPosition, i);
    }

    public E0M A04() {
        String readString = ((C22717BMe) this).A05.readString();
        if (readString == null) {
            return null;
        }
        C22717BMe A03 = A03();
        try {
            AnonymousClass00P r4 = this.A01;
            Method method = (Method) r4.get(readString);
            if (method == null) {
                System.currentTimeMillis();
                Class<C25849Cn7> cls = C25849Cn7.class;
                method = Class.forName(readString, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                r4.put(readString, method);
            }
            return (E0M) method.invoke((Object) null, AnonymousClass8BV.A1b(A03));
        } catch (IllegalAccessException e) {
            throw BE6.A0o("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw e2.getCause();
            }
            throw BE6.A0o("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw BE6.A0o("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw BE6.A0o("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public void A05(int i) {
        C22717BMe bMe = (C22717BMe) this;
        int i2 = bMe.A00;
        if (i2 >= 0) {
            int i3 = bMe.A06.get(i2);
            Parcel parcel = bMe.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        bMe.A00 = i;
        SparseIntArray sparseIntArray = bMe.A06;
        Parcel parcel2 = bMe.A05;
        sparseIntArray.put(i, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i);
    }

    public boolean A09(int i) {
        C22717BMe bMe = (C22717BMe) this;
        while (true) {
            int i2 = bMe.A02;
            int i3 = bMe.A03;
            int i4 = bMe.A01;
            if (i2 < i3) {
                if (i4 != i) {
                    if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                        break;
                    }
                    Parcel parcel = bMe.A05;
                    parcel.setDataPosition(i2);
                    int readInt = parcel.readInt();
                    bMe.A01 = parcel.readInt();
                    bMe.A02 += readInt;
                } else {
                    return true;
                }
            } else if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    private Class A00(Class cls) {
        AnonymousClass00P r5 = this.A00;
        String name = cls.getName();
        Class cls2 = (Class) r5.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = name2;
        A1b[1] = cls.getSimpleName();
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", A1b), false, cls.getClassLoader());
        r5.put(name, cls3);
        return cls3;
    }

    public void A08(E0M e0m) {
        if (e0m == null) {
            ((C22717BMe) this).A05.writeString((String) null);
            return;
        }
        try {
            Class<?> cls = e0m.getClass();
            ((C22717BMe) this).A05.writeString(A00(cls).getName());
            C22717BMe A03 = A03();
            try {
                AnonymousClass00P r6 = this.A02;
                String name = cls.getName();
                Method method = (Method) r6.get(name);
                if (method == null) {
                    Class A002 = A00(cls);
                    System.currentTimeMillis();
                    method = A002.getDeclaredMethod("write", new Class[]{cls, C25849Cn7.class});
                    r6.put(name, method);
                }
                Object[] A1b = AnonymousClass3MW.A1b();
                AnonymousClass001.A1Q(e0m, A03, A1b);
                method.invoke((Object) null, A1b);
                int i = A03.A00;
                if (i >= 0) {
                    int i2 = A03.A06.get(i);
                    Parcel parcel = A03.A05;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw BE6.A0o("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw e2.getCause();
                }
                throw BE6.A0o("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw BE6.A0o("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw BE6.A0o("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0a(e0m, A10);
            throw BE6.A0o(AnonymousClass000.A0y(" does not have a Parcelizer", A10), e5);
        }
    }

    public C25849Cn7(AnonymousClass00P r1, AnonymousClass00P r2, AnonymousClass00P r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public int A01(int i, int i2) {
        if (A09(i2)) {
            return ((C22717BMe) this).A05.readInt();
        }
        return i;
    }

    public Parcelable A02(Parcelable parcelable, int i) {
        if (!A09(i)) {
            return parcelable;
        }
        C22717BMe bMe = (C22717BMe) this;
        return AnonymousClass3Ma.A08(bMe.A05, bMe.getClass());
    }

    public void A06(int i, int i2) {
        A05(i2);
        ((C22717BMe) this).A05.writeInt(i);
    }

    public void A07(Parcelable parcelable, int i) {
        A05(i);
        ((C22717BMe) this).A05.writeParcelable(parcelable, 0);
    }
}
