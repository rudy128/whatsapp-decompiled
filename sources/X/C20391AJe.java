package X;

import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AJe  reason: case insensitive filesystem */
public final class C20391AJe implements C28580E8r, BAB {
    public final JsonWriter A00;
    public final boolean A01;
    public final BDh A02;
    public final Map A03;
    public final Map A04;

    public void A00(Object obj) {
        int i = 0;
        if (obj != null) {
            if (obj instanceof Number) {
                this.A00.value((Number) obj);
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null) {
                        this.A00.value(C108955ca.A14(bArr));
                        return;
                    }
                } else {
                    JsonWriter jsonWriter = this.A00;
                    jsonWriter.beginArray();
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int length = iArr.length;
                        while (i < length) {
                            jsonWriter.value((long) iArr[i]);
                            i++;
                        }
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        int length2 = jArr.length;
                        while (i < length2) {
                            jsonWriter.value(jArr[i]);
                            i++;
                        }
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        int length3 = dArr.length;
                        while (i < length3) {
                            jsonWriter.value(dArr[i]);
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        int length4 = zArr.length;
                        while (i < length4) {
                            jsonWriter.value(zArr[i]);
                            i++;
                        }
                    } else if (obj instanceof Number[]) {
                        for (Number A002 : (Number[]) obj) {
                            A00(A002);
                        }
                    } else {
                        for (Object A003 : (Object[]) obj) {
                            A00(A003);
                        }
                    }
                    jsonWriter.endArray();
                    return;
                }
            } else if (obj instanceof Collection) {
                JsonWriter jsonWriter2 = this.A00;
                jsonWriter2.beginArray();
                for (Object A004 : (Collection) obj) {
                    A00(A004);
                }
                jsonWriter2.endArray();
                return;
            } else if (obj instanceof Map) {
                JsonWriter jsonWriter3 = this.A00;
                jsonWriter3.beginObject();
                Iterator A15 = AnonymousClass000.A15((Map) obj);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    Object key = A16.getKey();
                    try {
                        String str = (String) key;
                        Object value = A16.getValue();
                        if (!this.A01) {
                            jsonWriter3.name(str);
                            if (value == null) {
                                jsonWriter3.nullValue();
                            }
                        } else if (value != null) {
                            jsonWriter3.name(str);
                        }
                        A00(value);
                    } catch (ClassCastException e) {
                        Object[] A1b = AnonymousClass3MX.A1b(key, 0);
                        A1b[1] = key.getClass();
                        throw new C21580AmU(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", A1b), e);
                    }
                }
                jsonWriter3.endObject();
                return;
            } else {
                E65 e65 = (E65) this.A03.get(cls);
                if (e65 == null) {
                    E65 e652 = (E65) this.A04.get(cls);
                    if (e652 != null) {
                        e652.BK0(obj, this);
                        return;
                    } else if (obj instanceof Enum) {
                        this.A00.value(((Enum) obj).name());
                        return;
                    } else {
                        e65 = this.A02;
                    }
                }
                JsonWriter jsonWriter4 = this.A00;
                jsonWriter4.beginObject();
                e65.BK0(obj, this);
                jsonWriter4.endObject();
                return;
            }
        }
        this.A00.nullValue();
    }

    public void BAq(C25775Clm clm, int i) {
        String str = clm.A00;
        JsonWriter jsonWriter = this.A00;
        jsonWriter.name(str);
        jsonWriter.value((long) i);
    }

    public void BAr(C25775Clm clm, long j) {
        String str = clm.A00;
        JsonWriter jsonWriter = this.A00;
        jsonWriter.name(str);
        jsonWriter.value(j);
    }

    public void BAs(C25775Clm clm, Object obj) {
        String str = clm.A00;
        if (!this.A01) {
            JsonWriter jsonWriter = this.A00;
            jsonWriter.name(str);
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
        } else if (obj != null) {
            this.A00.name(str);
        } else {
            return;
        }
        A00(obj);
    }

    public /* bridge */ /* synthetic */ void BAt(String str) {
        this.A00.value(str);
    }

    public /* bridge */ /* synthetic */ void BAu(boolean z) {
        this.A00.value(z);
    }

    public C20391AJe(BDh bDh, Writer writer, Map map, Map map2, boolean z) {
        this.A00 = new JsonWriter(writer);
        this.A03 = map;
        this.A04 = map2;
        this.A02 = bDh;
        this.A01 = z;
    }
}
