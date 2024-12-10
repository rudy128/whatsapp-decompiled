package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.1J5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J5 implements Runnable {
    public final /* synthetic */ AnonymousClass1J3 A00;
    public final /* synthetic */ C199910k A01;
    public final /* synthetic */ boolean A02;

    public static final void A01(String str, Map map, XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "map");
        if (str != null) {
            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        for (Map.Entry entry : map.entrySet()) {
            A00(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "map");
    }

    public static final void A00(Object obj, String str, XmlSerializer xmlSerializer) {
        int i;
        int i2;
        String str2;
        if (obj == null) {
            xmlSerializer.startTag((String) null, "null");
            if (str != null) {
                xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
            }
            xmlSerializer.endTag((String) null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag((String) null, "string");
            if (str != null) {
                xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag((String) null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null) {
                        xmlSerializer.startTag((String) null, "byte-array");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
                        StringBuilder sb = new StringBuilder(r7 * 2);
                        for (byte b : bArr) {
                            int i3 = (b >> 4) & 15;
                            if (i3 >= 10) {
                                i = (i3 + 97) - 10;
                            } else {
                                i = i3 + 48;
                            }
                            sb.append((char) i);
                            byte b2 = b & 15;
                            if (b2 >= 10) {
                                i2 = (b2 + 97) - 10;
                            } else {
                                i2 = b2 + 48;
                            }
                            sb.append((char) i2);
                        }
                        xmlSerializer.text(sb.toString());
                        xmlSerializer.endTag((String) null, "byte-array");
                        return;
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr != null) {
                        xmlSerializer.startTag((String) null, "int-array");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        xmlSerializer.attribute((String) null, "num", Integer.toString(r5));
                        for (int num : iArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Integer.toString(num));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "int-array");
                        return;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr != null) {
                        xmlSerializer.startTag((String) null, "long-array");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        xmlSerializer.attribute((String) null, "num", Integer.toString(r5));
                        for (long l : jArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Long.toString(l));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "long-array");
                        return;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    if (dArr != null) {
                        xmlSerializer.startTag((String) null, "double-array");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        xmlSerializer.attribute((String) null, "num", Integer.toString(r5));
                        for (double d : dArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Double.toString(d));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "double-array");
                        return;
                    }
                } else if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr != null) {
                        xmlSerializer.startTag((String) null, "string-array");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        xmlSerializer.attribute((String) null, "num", Integer.toString(r5));
                        for (String attribute : strArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", attribute);
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "string-array");
                        return;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr != null) {
                        xmlSerializer.startTag((String) null, "boolean-array");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        xmlSerializer.attribute((String) null, "num", Integer.toString(r5));
                        for (boolean bool : zArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Boolean.toString(bool));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "boolean-array");
                        return;
                    }
                } else if (obj instanceof Map) {
                    A01(str, (Map) obj, xmlSerializer);
                    return;
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    if (list != null) {
                        xmlSerializer.startTag((String) null, "list");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            A00(list.get(i4), (String) null, xmlSerializer);
                        }
                        xmlSerializer.endTag((String) null, "list");
                        return;
                    }
                } else if (obj instanceof Set) {
                    Set<Object> set = (Set) obj;
                    if (set != null) {
                        xmlSerializer.startTag((String) null, "set");
                        if (str != null) {
                            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                        }
                        for (Object A002 : set) {
                            A00(A002, (String) null, xmlSerializer);
                        }
                        xmlSerializer.endTag((String) null, "set");
                        return;
                    }
                } else if (obj instanceof CharSequence) {
                    xmlSerializer.startTag((String) null, "string");
                    if (str != null) {
                        xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                    }
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag((String) null, "string");
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("writeValueXml: unable to write value ");
                    sb2.append(obj);
                    throw new RuntimeException(sb2.toString());
                }
                xmlSerializer.startTag((String) null, "null");
                xmlSerializer.endTag((String) null, "null");
                return;
            }
            xmlSerializer.startTag((String) null, str2);
            if (str != null) {
                xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
            }
            xmlSerializer.attribute((String) null, "value", obj.toString());
            xmlSerializer.endTag((String) null, str2);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            X.10k r2 = r0.A01
            X.1J3 r4 = r0.A00
            boolean r10 = r0.A02
            java.lang.Object r3 = r2.A0D
            monitor-enter(r3)
            X.10j r9 = r2.A08     // Catch:{ all -> 0x0216 }
            java.io.File r7 = r9.A01     // Catch:{ all -> 0x0216 }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x003b
            long r0 = r2.A02     // Catch:{ all -> 0x0216 }
            long r5 = r4.A00     // Catch:{ all -> 0x0216 }
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0031
            if (r10 != 0) goto L_0x003b
            java.lang.Object r10 = r2.A0C     // Catch:{ all -> 0x0216 }
            monitor-enter(r10)     // Catch:{ all -> 0x0216 }
            long r0 = r2.A01     // Catch:{ all -> 0x002e }
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 0
            if (r8 != 0) goto L_0x002a
            r0 = 1
        L_0x002a:
            monitor-exit(r10)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x003b
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x0216 }
        L_0x0031:
            r0 = 1
            r4.A04 = r0     // Catch:{ all -> 0x0216 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ all -> 0x0216 }
            r0.countDown()     // Catch:{ all -> 0x0216 }
            goto L_0x0207
        L_0x003b:
            java.util.Map r12 = r4.A02     // Catch:{ Exception -> 0x01f9 }
            java.lang.Object r5 = r9.A02     // Catch:{ Exception -> 0x01f9 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x01f9 }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x007f
            java.io.File r6 = r9.A00     // Catch:{ all -> 0x01f6 }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x0052
            r7.delete()     // Catch:{ all -> 0x01f6 }
            goto L_0x007f
        L_0x0052:
            boolean r0 = r7.renameTo(r6)     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x007f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r1.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't rename file "
            r1.append(r0)     // Catch:{ all -> 0x01f6 }
            r1.append(r7)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = " to backup file "
            r1.append(r0)     // Catch:{ all -> 0x01f6 }
            r1.append(r6)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01f6 }
            monitor-exit(r5)     // Catch:{ all -> 0x01f6 }
            r0 = 0
            r4.A04 = r0     // Catch:{ Exception -> 0x01f9 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ Exception -> 0x01f9 }
            r0.countDown()     // Catch:{ Exception -> 0x01f9 }
            goto L_0x0207
        L_0x007f:
            java.lang.String r10 = "DefaultSharedPreferencesStorage/Couldn't create directory for SharedPreferences file "
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0087 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0087 }
            goto L_0x00ac
        L_0x0087:
            r6 = move-exception
            java.io.File r8 = r7.getParentFile()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r8.mkdir()     // Catch:{ SecurityException -> 0x018d }
            boolean r0 = r8.exists()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            if (r0 == 0) goto L_0x0141
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            if (r0 == 0) goto L_0x0154
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            if (r0 == 0) goto L_0x0154
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            if (r0 == 0) goto L_0x0154
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x012b }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x012b }
        L_0x00ac:
            java.io.File r9 = r9.A00     // Catch:{ all -> 0x0121 }
            long r14 = r9.length()     // Catch:{ all -> 0x0121 }
            r10 = 2048(0x800, double:1.0118E-320)
            r13 = 2048(0x800, float:2.87E-42)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cd
            r10 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            r13 = 32768(0x8000, float:4.5918E-41)
            goto L_0x00cd
        L_0x00c5:
            long r0 = (long) r13     // Catch:{ all -> 0x0121 }
            int r6 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x00cd
            int r13 = r13 * 2
            goto L_0x00c5
        L_0x00cd:
            X.1fB r10 = new X.1fB     // Catch:{ all -> 0x0121 }
            r10.<init>(r13)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ all -> 0x0121 }
            r10.setOutput(r8, r0)     // Catch:{ all -> 0x0121 }
            r6 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0121 }
            r1 = 0
            r10.startDocument(r1, r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "http://xmlpull.org/v1/doc/features.html#indent-output"
            r10.setFeature(r0, r6)     // Catch:{ all -> 0x0121 }
            A01(r1, r12, r10)     // Catch:{ all -> 0x0121 }
            r10.endDocument()     // Catch:{ all -> 0x0121 }
            java.io.FileDescriptor r0 = r8.getFD()     // Catch:{ IOException -> 0x00f3 }
            r0.sync()     // Catch:{ IOException -> 0x00f3 }
            goto L_0x010c
        L_0x00f3:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r1.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while syncing preferences, file= "
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x0121 }
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0121 }
            com.whatsapp.util.Log.w(r0, r6)     // Catch:{ all -> 0x0121 }
        L_0x010c:
            r9.delete()     // Catch:{ all -> 0x0121 }
            r8.close()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            monitor-exit(r5)     // Catch:{ all -> 0x01f6 }
            long r0 = r4.A00     // Catch:{ Exception -> 0x01f9 }
            r2.A02 = r0     // Catch:{ Exception -> 0x01f9 }
            r0 = 1
            r4.A04 = r0     // Catch:{ Exception -> 0x01f9 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ Exception -> 0x01f9 }
            r0.countDown()     // Catch:{ Exception -> 0x01f9 }
            goto L_0x0207
        L_0x0121:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0126 }
            goto L_0x01a0
        L_0x0126:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            goto L_0x01a0
        L_0x012b:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't create SharedPreferences file "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r1.append(r7)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            goto L_0x018c
        L_0x0141:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r0.append(r10)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r0.append(r7)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            goto L_0x018c
        L_0x0154:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Invalid directory for SharedPreferences file "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r1.append(r7)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = ", isDirectory="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = ", canRead="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = ", canWrite="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
        L_0x018c:
            throw r6     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
        L_0x018d:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r0.append(r10)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            r0.append(r7)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
        L_0x01a0:
            throw r1     // Catch:{ XmlPullParserException -> 0x01a3, IOException -> 0x01a1 }
        L_0x01a1:
            r6 = move-exception
            goto L_0x01bd
        L_0x01a3:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r1.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while serializing to XML, file= "
            r1.append(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x01f6 }
            r1.append(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f6 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x01f6 }
            goto L_0x01d5
        L_0x01bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r1.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while saving preferences, file= "
            r1.append(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x01f6 }
            r1.append(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f6 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x01f6 }
        L_0x01d5:
            boolean r0 = r7.exists()     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r7.delete()     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x01f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r1.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't clean up partially-written file "
            r1.append(r0)     // Catch:{ all -> 0x01f6 }
            r1.append(r7)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01f6 }
        L_0x01f5:
            throw r6     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ Exception -> 0x01f9 }
        L_0x01f9:
            r1 = move-exception
            java.lang.String r0 = "LightSharedPreferencesImpl/writeToFile: Got exception:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0216 }
            r0 = 0
            r4.A04 = r0     // Catch:{ all -> 0x0216 }
            java.util.concurrent.CountDownLatch r0 = r4.A03     // Catch:{ all -> 0x0216 }
            r0.countDown()     // Catch:{ all -> 0x0216 }
        L_0x0207:
            monitor-exit(r3)     // Catch:{ all -> 0x0218 }
            java.lang.Object r1 = r2.A0C
            monitor-enter(r1)
            int r0 = r2.A00     // Catch:{ all -> 0x0213 }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x0213 }
            monitor-exit(r1)     // Catch:{ all -> 0x0213 }
            return
        L_0x0213:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0213 }
            throw r0
        L_0x0216:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x0218:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0218 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1J5.run():void");
    }

    public /* synthetic */ AnonymousClass1J5(AnonymousClass1J3 r1, C199910k r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }
}
