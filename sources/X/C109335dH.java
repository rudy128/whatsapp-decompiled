package X;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5dH  reason: invalid class name and case insensitive filesystem */
public class C109335dH extends AbstractCursor {
    public static final String[] A06 = C124536Ys.A00;
    public int A00 = -1;
    public Cursor A01;
    public boolean A02 = false;
    public final C18030ve A03;
    public final AnonymousClass1BI A04;
    public final AnonymousClass1W6 A05;

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        if (i != 5) {
            return 0;
        }
        AnonymousClass21V A012 = A01();
        C17960vV.A07(A012);
        return A012.A0u;
    }

    public short getShort(int i) {
        if (i != 5) {
            return 0;
        }
        Log.e("MediaCursor: Try to access media type with short type");
        return 0;
    }

    public int getType(int i) {
        return (i == 0 || i == 2 || i == 5 || i == 6) ? 1 : 3;
    }

    public boolean isNull(int i) {
        return false;
    }

    private boolean A00() {
        AnonymousClass21V A012;
        C62572rc r1;
        C18030ve r0;
        File file;
        if (this.A01.isClosed() || (A012 = A01()) == null || (r1 = A012.A02) == null) {
            return false;
        }
        if ((A012.A0v.A02 || r1.A0V) && (file = r1.A0G) != null) {
            Uri fromFile = Uri.fromFile(file);
            if (fromFile == null || fromFile.getPath() == null) {
                return false;
            }
            return C108975cc.A1M(fromFile.getPath());
        } else if (!this.A02 || !(A012 instanceof AnonymousClass21Y) || (r0 = this.A03) == null || !AnonymousClass72Z.A02(r0, (AnonymousClass21W) A012)) {
            return false;
        } else {
            return true;
        }
    }

    public AnonymousClass21V A01() {
        AnonymousClass206 A022;
        Cursor cursor = this.A01;
        if (cursor.isClosed()) {
            return null;
        }
        AnonymousClass1BI r1 = this.A04;
        AnonymousClass1W6 r0 = this.A05;
        if (r1 == null) {
            A022 = r0.A01(cursor);
        } else {
            A022 = r0.A02(cursor, r1);
        }
        if (A022 == null || (A022 instanceof AnonymousClass23N)) {
            return null;
        }
        return (AnonymousClass21V) A022;
    }

    public int getCount() {
        try {
            int i = this.A00;
            if (i < 0) {
                return this.A01.getCount();
            }
            return i;
        } catch (NullPointerException e) {
            Log.e("MediaCursor/getCount/NPE", e);
            return 0;
        }
    }

    public long getLong(int i) {
        if (i == 0) {
            return C17890vO.A06(this.A01, "_id");
        }
        if (i == 2) {
            AnonymousClass21V A012 = A01();
            C17960vV.A07(A012);
            return A012.A0I;
        } else if (i != 6) {
            return 0;
        } else {
            AnonymousClass21V A013 = A01();
            C17960vV.A07(A013);
            return (long) A013.A0D;
        }
    }

    public String getString(int i) {
        C62572rc r0;
        File file;
        if (i == 0) {
            return Long.toString(C17890vO.A06(this.A01, "_id"));
        }
        if (i == 1) {
            AnonymousClass21V A012 = A01();
            if (A012 == null || (r0 = A012.A02) == null || (file = r0.A0G) == null) {
                return "";
            }
            return file.getAbsolutePath();
        } else if (i == 2) {
            AnonymousClass21V A013 = A01();
            if (A013 != null) {
                return Long.toString(A013.A0I);
            }
            return "";
        } else if (i == 3) {
            AnonymousClass21V A014 = A01();
            C17960vV.A07(A014);
            return A014.A18();
        } else if (i != 4) {
            return "";
        } else {
            AnonymousClass21V A015 = A01();
            C17960vV.A07(A015);
            int i2 = A015.A0u;
            if (i2 == 1) {
                return "image/*";
            }
            if (i2 == 2) {
                return "audio/*";
            }
            if (i2 == 3) {
                return "video/*";
            }
            if (i2 != 9) {
                if (i2 == 13) {
                    return "image/gif";
                }
                if (i2 == 23 || i2 == 37 || i2 == 25) {
                    return "image/*";
                }
                if (i2 != 26) {
                    if (i2 == 28) {
                        return "video/*";
                    }
                    if (i2 != 29) {
                        return "";
                    }
                    return "image/gif";
                }
            }
            return A015.A06;
        }
    }

    public boolean onMove(int i, int i2) {
        String str;
        if (!this.A01.isClosed()) {
            if (i > i2 * 2) {
                this.A01.moveToPosition(-1);
                i = -1;
            }
            while (true) {
                if (i2 > i) {
                    boolean z = false;
                    int i3 = 0;
                    while (true) {
                        if (this.A01.isClosed() || !this.A01.moveToNext()) {
                            break;
                        } else if (A00()) {
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 > 0) {
                        C17900vP.A0j("MediaCursor/moveToNextImpl/next/skip ", AnonymousClass000.A10(), i3);
                    }
                    i++;
                    if (!z) {
                        this.A00 = i;
                        this.A01.moveToPosition(-1);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("MediaCursor/onMove/next/Real Count ");
                        str = C17880vN.A0t(A10, this.A00);
                        break;
                    }
                } else {
                    while (i2 < i) {
                        boolean z2 = false;
                        int i4 = 0;
                        while (true) {
                            if (this.A01.isClosed() || !this.A01.moveToPrevious()) {
                                break;
                            } else if (A00()) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 > 0) {
                            C17900vP.A0j("MediaCursor/moveToPreviousImpl/prev/skip ", AnonymousClass000.A10(), i4);
                        }
                        if (!z2) {
                            this.A01.moveToPosition(-1);
                            str = "MediaCursor/onMove/prev/Not Found";
                        } else {
                            i--;
                        }
                    }
                    return true;
                }
            }
            Log.i(str);
            onChange(true);
        }
        return false;
    }

    public C109335dH(Cursor cursor, C18030ve r4, AnonymousClass1BI r5, AnonymousClass1W6 r6) {
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = cursor;
        this.A04 = r5;
        if (r4 != null) {
            this.A02 = !C108985cd.A1V(r4);
        }
        moveToPosition(0);
    }

    public void close() {
        super.close();
        this.A01.close();
    }

    public String[] getColumnNames() {
        return A06;
    }
}
