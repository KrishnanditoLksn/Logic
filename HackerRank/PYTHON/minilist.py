def stringUserMenu():
    print("1 . Pecah Kata ")
    print("2 . Gabungkan kata ")
    print("3 . Pop Kata ")
    print("4 . Kata terbalik")



def programList():
    isRunning = True

    while(isRunning):
        print("1 . GAME KATA ")
        print("2 . KELUAR")
        userChoiceInput = (int(input("Pilihan anda : ")))

        if userChoiceInput == 1 :

            while(isRunning):
                stringUserMenu()
                s = int (input("Pilih  : "))

                if s == 1 :
                    print("Game pecah kata ")
                    userStringInput = (input('Masukkan kata : '))
                    print("Akan dimasukkan ke variabel baru bertipe list")
                    listUserVar = []
                    listUserVar.append(userStringInput)
                    print(listUserVar)
                    print("String sudah menjadi list dan akan dipecah " , "\n" ,[x for x in userStringInput])

                elif s == 2 :
                    listUserVar = []
                    print("Game gabungkan kata ")
                    n = int(input("Masukkan jumlah kata  : "))

                    for x in range(n):                
                        userStringInput  =(input("Masukkan kata : "))
                        listUserVar.append(userStringInput)
                    print(listUserVar)

                elif s== 3 :
                    print("Game pop kata ")


                elif s ==4 :
                    print("Game kebalikan kata")


                else:
                    print("Pilih input yang tersedia (1 - 5 )!!!")
                    

        elif userChoiceInput == 2 :
            print("Keluar ")
            break
        
        elif  userChoiceInput  > 2 :
            print("Input yang benar ")



programList()        