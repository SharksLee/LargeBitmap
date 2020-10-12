package com.gavin.plugin.lifecycle;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.ALOAD;
import static org.objectweb.asm.Opcodes.DUP;
import static org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static org.objectweb.asm.Opcodes.NEW;
import static org.objectweb.asm.Opcodes.POP;
import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.RETURN;
import static org.objectweb.asm.Opcodes.GETSTATIC;
import static org.objectweb.asm.Opcodes.ISTORE;
import static org.objectweb.asm.Opcodes.ILOAD;
import static org.objectweb.asm.Opcodes.ICONST_M1;
import static org.objectweb.asm.Opcodes.IF_ICMPEQ;
import static org.objectweb.asm.Opcodes.INSTANCEOF;
import static org.objectweb.asm.Opcodes.IFEQ;
import static org.objectweb.asm.Opcodes.CHECKCAST;
/**
 * @author gavin
 * @date 2019/2/19
 */
public class SetImageDrawableVisitor extends MethodVisitor {

    public SetImageDrawableVisitor(MethodVisitor mv) {
        super(Opcodes.ASM4, mv);
    }
//
    @Override
    public void visitCode() {
        super.visitCode();

        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/support/v7/widget/AppCompatImageView", "getId", "()I", false);
        mv.visitVarInsn(ISTORE, 2);
        Label l2 = new Label();
        mv.visitLabel(l2);
        mv.visitLineNumber(102, l2);
        mv.visitVarInsn(ILOAD, 2);
        mv.visitInsn(ICONST_M1);
        Label l3 = new Label();
        mv.visitJumpInsn(IF_ICMPEQ, l3);
        Label l4 = new Label();
        mv.visitLabel(l4);
        mv.visitLineNumber(103, l4);
        mv.visitLdcInsn("ImageView");
        mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        mv.visitLdcInsn("setImageDrawable: ");
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/support/v7/widget/AppCompatImageView", "getResources", "()Landroid/content/res/Resources;", false);
        mv.visitVarInsn(ILOAD, 2);
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/content/res/Resources", "getResourceName", "(I)Ljava/lang/String;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "d", "(Ljava/lang/String;Ljava/lang/String;)I", false);
        mv.visitInsn(POP);
        Label l5 = new Label();
        mv.visitLabel(l5);
        mv.visitLineNumber(104, l5);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(INSTANCEOF, "android/graphics/drawable/BitmapDrawable");
        mv.visitJumpInsn(IFEQ, l3);
        Label l6 = new Label();
        mv.visitLabel(l6);
        mv.visitLineNumber(105, l6);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(CHECKCAST, "android/graphics/drawable/BitmapDrawable");
        mv.visitVarInsn(ASTORE, 3);
        Label l7 = new Label();
        mv.visitLabel(l7);
        mv.visitLineNumber(106, l7);
        mv.visitLdcInsn("ImageView");
        mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        mv.visitLdcInsn("memory size: ");
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        mv.visitVarInsn(ALOAD, 3);
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/graphics/drawable/BitmapDrawable", "getBitmap", "()Landroid/graphics/Bitmap;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "android/graphics/Bitmap", "getByteCount", "()I", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        mv.visitMethodInsn(INVOKESTATIC, "android/util/Log", "d", "(Ljava/lang/String;Ljava/lang/String;)I", false);
        mv.visitInsn(POP);
        mv.visitLabel(l3);
        mv.visitLineNumber(109, l3);
    }

}
