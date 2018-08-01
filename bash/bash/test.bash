#!/bin/bash
clear;
echo "----Estado y Salud del Sistema Operativo----"
echo
echo "Día y hora"
date |awk '{print $1,$3,$4}'
echo
echo "Nombre de la Máquina:"
hostname
echo
echo "Estado de la Memoria :"
cat /proc/meminfo |grep "Mem*"
cat /proc/meminfo |grep "Buffers"
cat /proc/meminfo |grep "Cached"
echo
echo "Estado de la Cpu:"
cat /proc/stat |grep "cpu"
echo
echo "Estado de Discos Duros"
df -h | grep -v "tmp"| grep -v "udev" | grep -v "sda1"
echo
echo "Usuario actual"
who | grep -v "pts" | awk '{print$1}'

echo
echo "Duracion del login actual"
uptime | awk '{print $3}'
echo
echo "Cantidad de archivos en /home"
ls -l -h /home/bioinformatica | awk '{ sum += $1 } END { print NR-1}'
echo
echo "Megabytes en /home"
du $HOME -s -m |awk '{print $1}'
