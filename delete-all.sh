#!/bin/bash

docker kill demo_env_app
docker rm demo_env_app


docker system prune -f

rm -rf ~/docker-data/