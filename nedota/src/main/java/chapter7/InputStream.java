package glavа7;

// все красное. не понятно что делать, помогите((

    File file = new File("file.bin");
    InputStream is = new FileInputStream(file);
    long length = file.length();

    if(length >Integer.MAX_VALUE) {
        throw new IOException("файл " + file.getName() + "слишком длинный!");
    }

    byte[] bytes = new byte[(int) length];
    int offset = 0;
    int numRead = 0;
    while(offset < bytes.length && ( numRead = is_read(bytes, offset, bytes.length-offset))>=0)

    {
        offset += numRead;
    }
    if(offset<bytes.length)

    {
        throw new IOException("не удалось проситать файл " + file.getName() + "целиком");
    }
    is.close();

