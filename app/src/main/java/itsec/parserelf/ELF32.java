package itsec.parserelf;

/**
 * Created by John.Lu on 2017/8/3.
 */

public class ELF32 {


    /**
     * elf_header
     *typedef struct elf32_hdr{
     unsigned char e_ident[EI_NIDENT];
     Elf32_Half    e_type;
     Elf32_Half    e_machine;
     Elf32_Word    e_version;
     Elf32_Addr    e_entry;  // Entry point
     Elf32_Off e_phoff;
     Elf32_Off e_shoff;
     Elf32_Word    e_flags;
     Elf32_Half    e_ehsize;
     Elf32_Half    e_phentsize;
     Elf32_Half    e_phnum;
     Elf32_Half    e_shentsize;
     Elf32_Half    e_shnum;
     Elf32_Half    e_shstrndx;
     } Elf32_Ehdr;
     * */
    public static class elf32_hdr{
        public byte[] e_ident = new byte[16];//magic
        public byte[] e_type =  new byte[2];//
        public byte[] e_machine = new byte[2];
        public byte[] e_version = new byte[4];
        public byte[] e_entry = new byte[4];
        public byte[] e_phoff = new byte[4];
        public byte[] e_shoff = new byte[4];
        public byte[] e_flags = new byte[4];
        public byte[] e_ehsize = new byte[2];
        public byte[] e_phentsize = new byte[2];
        public byte[] e_phnum = new byte[2];
        public byte[] e_shentsize = new byte[2];
        public byte[] e_shnum = new byte[2];
        public byte[] e_shstrndx = new byte[2];
    }
    /*
    * elf32_phdr
    *typedef struct elf32_phdr{
          Elf32_Word    p_type;
          Elf32_Off p_offset;
          Elf32_Addr    p_vaddr;
          Elf32_Addr    p_paddr;
          Elf32_Word    p_filesz;
          Elf32_Word    p_memsz;
          Elf32_Word    p_flags;
          Elf32_Word    p_align;
        } Elf32_Phdr;
    *
    * */
    public static class elf32_phdr{
        public byte[]  p_type = new byte[4];//有多个不同的值
        public byte[] p_off =  new byte[4];
        public byte[] p_vaddr = new byte[4];
        public byte[] p_paddr = new byte[4];
        public byte[] p_filesz =  new byte[4];
        public byte[] p_memsz = new byte[4];
        public byte[] p_flags = new byte[4];//有多个不同的值
        public byte[] p_align = new byte[4];
    }

    //***********************************************
    /**
     * elf_shdr
     * typedef struct elf32_shdr {
     Elf32_Word    sh_name;
     Elf32_Word    sh_type;
     Elf32_Word    sh_flags;
     Elf32_Addr    sh_addr;
     Elf32_Off sh_offset;
     Elf32_Word    sh_size;
     Elf32_Word    sh_link;
     Elf32_Word    sh_info;
     Elf32_Word    sh_addralign;
     Elf32_Word    sh_entsize;
     } Elf32_Shdr;
     *
     * */
    public static class elf32_shdr{
        public byte[] sh_name = new byte[4];
        public byte[] sh_type = new byte[4];//有多个选值 ，
        public byte[] sh_flags = new byte[4];//有多个标记值
        public byte[] sh_addr = new byte[4];
        public byte[] sh_offset = new byte[4];
        public byte[] sh_size = new byte[4];
        public byte[] sh_link = new byte[4];
        public byte[] sh_info = new byte[4];
        public byte[] sh_addralign = new byte[4];
        public byte[] sh_entsize = new byte[4];
    }
    //*************************************sh_type的值有如下*********************************
    public static final  int SH_NULL =0;
    public static final  int SH_PROGBITS =1;
    public static final  int SH_SYMTAB =2;
    public static final  int SH_STRTAB =3;
    public static final  int SH_RELA =4;
    public static final  int SH_HASH =5;
    public static final  int SH_DYNAMIC =6;
    public static final  int SH_NOTE =7;
    public static final  int SH_NOBITS =8;
    public static final  int SH_REL =9;
    public static final  int SH_SHLIB =10;
    public static final  int SH_DYNSYM=11;
    public static final  int SH_NUM =12;
    public static final  int SH_LOPROC =0x70000000;
    public static final  int SH_HIPROC =0x7fffffff;
    public static final  int SH_LOUSER =0x80000000;
    public static final  int SH_HIUSER =0xffffffff;
    public static final  int SH_MIPS_LIST =0x70000000;
    public static final  int SH_MIPS_CONFLICT =0x70000002;
    public static final  int SH_MIPS_GPTAB =0x70000003;
    public static final  int SH_MIPS_UCODE=0x70000004;
    //***********************sh_flags*****************************
    public static final  int SHF_WRITE =0x1;
    public static final int SH_ALLOC =0x2;
    public static final  int SH_EXECINSTR =0x4;
    public static final  int  SH_MASKPROC =0xf0000000;
    public static final  int SH_MIPS_GPREL  = 0x10000000;
    /**
     * strtb 字符串表
     *
     * **/
    public static class elf32_strtb{
        public byte[] strname;
        public int len;
    }

}
